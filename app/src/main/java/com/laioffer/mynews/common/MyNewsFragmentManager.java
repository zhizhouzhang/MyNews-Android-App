package com.laioffer.mynews.common;

import android.os.Bundle;

public interface MyNewsFragmentManager {
    // void doFragmentTransaction(MyNewsBasicFragment basicFragment);
    void startActivityWithBundle(Class<?> clazz, boolean isFinished, Bundle bundle);

    void showSnackBar(String message);
}
