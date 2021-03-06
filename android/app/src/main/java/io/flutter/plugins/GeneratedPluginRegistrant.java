package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
      com.example.countdown_flutter.CountdownFlutterPlugin.registerWith(shimPluginRegistry.registrarFor("com.example.countdown_flutter.CountdownFlutterPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.deviceinfo.DeviceInfoPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin());
    flutterEngine.getPlugins().add(new com.gonoter.flutter_beep.FlutterBeepPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
    flutterEngine.getPlugins().add(new dev.vbonnet.flutterwebbrowser.FlutterWebBrowserPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.imagepicker.ImagePickerPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
      net.kikuchy.plain_notification_token.PlainNotificationTokenPlugin.registerWith(shimPluginRegistry.registrarFor("net.kikuchy.plain_notification_token.PlainNotificationTokenPlugin"));
      com.example.qrcode.QrcodePlugin.registerWith(shimPluginRegistry.registrarFor("com.example.qrcode.QrcodePlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.share.SharePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
      de.florianweinaug.system_settings.SystemSettingsPlugin.registerWith(shimPluginRegistry.registrarFor("de.florianweinaug.system_settings.SystemSettingsPlugin"));
      fr.g123k.torch_compat.TorchCompatPlugin.registerWith(shimPluginRegistry.registrarFor("fr.g123k.torch_compat.TorchCompatPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.videoplayer.VideoPlayerPlugin());
    flutterEngine.getPlugins().add(new creativemaybeno.wakelock.WakelockPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.webviewflutter.WebViewFlutterPlugin());
  }
}
