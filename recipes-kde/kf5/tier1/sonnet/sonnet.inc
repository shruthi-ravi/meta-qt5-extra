SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRCREV = "a9fcc63282ddbc6c93a590494cfb57e6164e8364"
S = "${WORKDIR}/git"