SUMMARY = "Hawaii desktop environment shell"
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit cmake_qt5 pythonnative
#inherit systemd

SRC_URI = " \
    git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=master \
    file://0001-find-host-s-git.patch \
"
SRCREV = "054fef1e7e2106850e697c3bf7256eb58245ee72"
PV = "0.4.92+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS = " \
    extra-cmake-modules-native \
    qtbase \
    qtdeclarative \
    qtwayland-native \
    \
    wayland \
    \
    libqtxdg \
    \
    kconfig \
    kcoreaddons \
    solid \
    \
    greenisland \
"

# REVISIT optionals
DEPENDS += " \
    alsa-lib \
    pulseaudio \
"

PACKAGECONFIG[nm_qt] = "-DENABLE_NETWORK_MANAGER=OFF,-DENABLE_NETWORK_MANAGER=ON,networkmanager-qt"
PACKAGECONFIG ??= "nm_qt"

# starter scripts rely on bash qdbus catchsegv
RDEPENDS_${PN} = "bash qttools-tools qtwayland-plugins catchsegv"

# REVISIT optionals
RRECOMMENDS_${PN} += " \
    hawaii-wallpapers \
    hawaii-icon-themes \
    weston \
"

FILES_${PN} += " \
	${datadir} \
	${libdir}/qml \
	${libdir}/plugins \
	${libdir}/systemd \
"

FILES_${PN}-dbg += " \
        ${libdir}/plugins/*/.debug \
	${libdir}/qml/*/*/.debug \
	${libdir}/qml/*/*/*/.debug \
"