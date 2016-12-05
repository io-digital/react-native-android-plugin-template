
# react-native-android-plugin-template

> AndroidStudio-importable react-native android plugin template

## Getting Started

### Prerequisites

If Android SDK or build-tools-23.0.1 is not installed, run the following with elevated privileges:

```bash
# update this variable with the latest url from https://developer.android.com/studio/index.html#downloads
android_sdk_url=https://dl.google.com/android/android-sdk_r24.4.1-linux.tgz

# android sdk install path
install_prefix=/usr/local
android_sdk=android-sdk

# attempt android sdk installation if not present
[[ -d $install_prefix/$android_sdk ]] || {
    curl --silent -L $android_sdk_url -o $android_sdk.tgz
    tar xf $android_sdk.tgz
    mv $android_sdk $install_prefix
    rm $android_sdk.tgz
}

# attempt build tools installation
echo y | $install_prefix/$android_sdk/android update sdk --no-ui --all --filter build-tools-23.0.1
```

### Importing

1. Get a copy `git clone https://github.com/io-digital/react-native-android-plugin-template your_lib_name_here`
2. Start fresh `cd your_lib_name_here && rm -rf .git/ && git init`
3. Add a remote `git remote add origin git+ssh://your/remote/url/here`
4. Change the name of `your_lib_name_here/` and its counterpart in `settings.gradle`
5. Update `AndroidManifest.xml` and the package directory structure to reflect your package-identifier
6. Import this directory into AndroidStudio as a Gradle-based project

## Publishing

* Update this readme
* Add a license
* Update `package.json`
* Set release configuration parameters in `your_lib_name_here/build.gradle`