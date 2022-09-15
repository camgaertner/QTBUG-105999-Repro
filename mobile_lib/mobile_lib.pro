
QT -= gui

# Note: Adding this line will fix the crash
# You may need to delete androidnotifier/lib/libnotify_test_lib_x86_64.so to ensure it's rebuilt
#QT -= core

# Include
include($$PWD/mobile_lib.pri)

# Config
TEMPLATE = lib
TARGET = notify_test_lib

# Path
DESTDIR = $$PWD/../androidnotifier/lib

message($$DESTDIR)

INCLUDEPATH += $$PWD
