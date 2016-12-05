
# react-native-android-plugin-template

> AndroidStudio-importable react-native android plugin template

## Getting Started

### Prerequisites

If Android SDK or build-tools-23.0.1 is not installed, run the following with elevated privileges:

```bash
# update this variable with the latest url from https://developer.android.com/studio/index.html#downloads
android_sdk_url=https://dl.google.com/android/android-sdk_r24.4.1-linux.tgz

# android sdk install path
my_android_sdk_path=/usr/local/android-sdk

# attempt android sdk installation if not present
[[ -d $my_android_sdk_path ]] || {
        curl --silent -L $android_sdk_url -o android-sdk.tgz
        tar xf android-sdk.tgz
        mv android-sdk /usr/local
        rm android-sdk.tgz
    }
}

# attempt build tools installation
echo y | /usr/local/android-sdk/android update sdk --no-ui --all --filter build-tools-23.0.1
```

### Importing

1. Change the name of the `your_lib_name_here` folder and its counterpart in `settings.gradle`
2. Import this directory into AndroidStudio as a Gradle-based project
3. Update `AndroidManifest.xml` and the package directory structure to reflect your package-identifier 

## Publishing

* Update this readme
* Add a license
* Update `package.json`
* Set release configuration parameters in `your_lib_name_here/build.gradle`