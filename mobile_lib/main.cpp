
#include <jni.h>

extern "C"
{
    JNIEXPORT jint JNICALL Java_org_qtproject_example_androidnotifier_MainActivity_test(JNIEnv* env, jobject thiz)
    {
        return 42;
    }
}
