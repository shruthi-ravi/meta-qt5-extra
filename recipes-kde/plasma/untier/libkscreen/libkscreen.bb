SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma cmake-lib

DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "wayland", "kwayland", "", d)} \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "34e6da6220392b8836c7a8b0c60f32fb"
SRC_URI[sha256sum] = "a3cc64e6b94fdee14fb19a1185007953b6701fbf1e8d5564c30e55b04ec4e5ec"

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
"


FILES_${PN}-dbg += " \
    ${libdir}/plugins/kf5/kscreen/.debug \
    ${libexecdir}/kf5/.debug \
"

CMAKE_HIDE_ERROR[1] = "KF5Screen, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "KF5Screen, -S${libdir}, -S${STAGING_LIBDIR}"
