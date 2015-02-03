SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRCREV = "0d0924fb7900505bc9f9fab7767e35bb2b417f30"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"