inherit meson systemd

SUMMARY = "ATTN and HwDiags Support"
DESCRIPTION = "Attention Handler and Hardware Diagnostics"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/openbmc/openpower-hw-diags"

SYSTEMD_SERVICE_${PN} = "attn_handler.service"
PV = "0.1+git${SRCPV}"
SRCREV = "cac5dc657c2da783b67a7995a4f6c3b497f44aa0"

S = "${WORKDIR}/git"

DEPENDS = "boost libgpiod pdbg phosphor-logging sdbusplus openpower-libhei"
FILES_${PN} += "${UNITDIR}/attn_handler.service"
