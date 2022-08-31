QT += core gui qml quick quickcontrols2
greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

SOURCES += \
    main.cpp \

RESOURCES += \
    main.qrc

target.path = $$[QT_INSTALL_EXAMPLES]/corelib/platform/androidnotifier
INSTALLS += target

ANDROID_PACKAGE_SOURCE_DIR = $$PWD/android
OTHER_FILES += \
    android/AndroidManifest.xml

ANDROID_EXTRA_LIBS += $$PWD/lib/libnotify_test_lib_x86_64.so
