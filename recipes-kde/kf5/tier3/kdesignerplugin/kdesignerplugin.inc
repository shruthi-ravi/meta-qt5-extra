SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fce4039e793196859518c47235e15f82"
SRC_URI[sha256sum] = "2fe41d35f59367f1228b8de3490d4ae88c464e04c98a9c25a0970b899d944d46"
