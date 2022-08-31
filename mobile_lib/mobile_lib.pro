
QT -= core gui

# Include
include($$PWD/mobile_lib.pri)

# Config
TEMPLATE = lib
TARGET = notify_test_lib

# Path
DESTDIR = $$PWD/../androidnotifier/lib
INCLUDEPATH += $$PWD
