#  Read Me 

## Install

1. clone from https://gitlab.com/venture-swipe/front-end-ios.git

2. Go to project directory

    ```bash
    cd VentureSwipe
    ```

2. install the Ruby dependencies

    ```bash
    bundle check || bundle install --path vendor/bundle
    ```
This will install all used dependencies into the `vendor` folder inside project. If something goes wrong, feel free to delete this folder and try again.
Pay attention that `vendor` folder should also be `gitignore`d.

### Using _Fastlane_ 

Now that you have fastlane installed you can use it to run project all sorts of ways. See `README.md` in the `VentureSwipe/fasltane` folder for more detailed info on which options are available.

If you have fastlane installed globally on your machine you can use it via `fastlane <command>`, but be cautious as using it from `vendor/bundle` via `bundle exec` makes it safer as all versions (including ruby, fastlane and cocoapods) are fixed through version control in this repository in various gem configs.

### Sync code signing provisions

1. Run fastlane `match` to load provisions and certificates:

```bash
bundle exec fastlane match
```


### Run project for debug (development mode)

1. Install source code dependencies. Please use fastlane to do so:
    ```bash
    bundle exec pod install
    ```

2. use the `VentureSwipe.xcworkspace` to open the project in xcode.

Available targets:
* `VentureSwipe` -- to be used on devices, includes ZOOM SDK which does not support simulator
* `VentureSwipe_Simulator` -- to be used on simulators (and devices). Does not include ZOOM SDK (uses stub code instead)

Available configurations:
* `Release` -- to be used on archiving for release. Makes app to look at `VentureSurfProd` database
* `Debug` -- to be used on debugging or for internal testing. Makes app to look at `VentureSurfDev` database

Firebase config plists can be found at `VentureSwipe/VentureSwipe/Firebase`.

## Delivery

### Deliver Release build

Run `release_testflight` lane to deliver release build to testflight. This build is going to look at Prod database.

```bash
bundle exec fastlane release_testflight
```

### Deliver Testing build

Run `tf_test` lane to deliver testing build to testflight. This build is going to look at Dev database. 

NB: this lane builds `VS_Test` target which has a different bundle identifier (`com.opentek.vstest`)

```bash
bundle exec fastlane tf_test
```




## API DOCUMENTATION
https://app.swaggerhub.com/apis/VentureSurf/VentureSurf_backend/1.2


## DESIGN 
https://www.figma.com/file/pubIxj2WuKdYl41yPBZSlt/%F0%9F%A6%84Mobile?node-id=16615%3A66300


## CONFIGURATION REPO
https://gitlab.croc.ru/venturesurf/ios-application/vs-configs
