android_binary(
  name = 'app',
  manifest = 'src/main/AndroidManifest.xml',
  target = 'Google Inc.:Google APIs:19',
  keystore = ':debug_keystore',
  deps = [
    '//third-party:google-play-service',
    ':res',
    ':src',
  ],
)

keystore(
  name = 'debug_keystore',
  store = 'debug.keystore',
  properties = 'debug.keystore.properties',
)

android_resource(
  name = 'res',
  res = 'src/main/res',
  package = 'com.example.myapp',
  visibility = [ 'PUBLIC' ],
  deps = [
    '//third-party:google-play-service',
  ],
)

android_library(
  name = 'src',
  srcs = glob(['src/**/*.java']),
  deps = [
    ':res',
    '//third-party:google-play-service',
  ],
  exported_deps = ['//third-party:google-play-service']
)
