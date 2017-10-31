package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam;
import org.json.JSONObject;

public class ay
{
  private static ay mCa;
  private static TMQQDownloaderOpenSDK mCb;
  
  private ay()
  {
    GMTrace.i(12599018127360L, 93870);
    GMTrace.o(12599018127360L, 93870);
  }
  
  public static void Z(Context paramContext, String paramString)
  {
    GMTrace.i(12599554998272L, 93874);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, params is null or nil");
      GMTrace.o(12599554998272L, 93874);
      return;
    }
    if (paramContext == null)
    {
      w.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, context is null");
      GMTrace.o(12599554998272L, 93874);
      return;
    }
    w.i("MicroMsg.QQDownloaderSDKWrapper", "add download task to qqdownloader:[%s]", new Object[] { paramString });
    paramString = new a().zi(paramString);
    try
    {
      aEZ();
      aFa().startToDownloadTaskList(paramContext, paramString, true, true);
      GMTrace.o(12599554998272L, 93874);
      return;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.QQDownloaderSDKWrapper", paramContext, "", new Object[0]);
      GMTrace.o(12599554998272L, 93874);
    }
  }
  
  private static int a(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam)
  {
    GMTrace.i(12599957651456L, 93877);
    try
    {
      aEZ();
      paramTMQQDownloaderOpenSDKParam = aFa().getDownloadTaskState(paramTMQQDownloaderOpenSDKParam);
      if (paramTMQQDownloaderOpenSDKParam != null)
      {
        int i = paramTMQQDownloaderOpenSDKParam.mState;
        GMTrace.o(12599957651456L, 93877);
        return i;
      }
    }
    catch (Exception paramTMQQDownloaderOpenSDKParam)
    {
      w.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus failed : %s", new Object[] { paramTMQQDownloaderOpenSDKParam.getMessage() });
      GMTrace.o(12599957651456L, 93877);
    }
    return -1;
  }
  
  public static ay aEZ()
  {
    GMTrace.i(12599152345088L, 93871);
    if (mCa == null) {}
    try
    {
      if (mCa == null) {
        mCa = new ay();
      }
      ay localay = mCa;
      GMTrace.o(12599152345088L, 93871);
      return localay;
    }
    finally {}
  }
  
  private static TMQQDownloaderOpenSDK aFa()
  {
    GMTrace.i(12599286562816L, 93872);
    if (mCb == null)
    {
      localTMQQDownloaderOpenSDK = TMQQDownloaderOpenSDK.getInstance();
      mCb = localTMQQDownloaderOpenSDK;
      localTMQQDownloaderOpenSDK.initQQDownloaderOpenSDK(ab.getContext());
    }
    TMQQDownloaderOpenSDK localTMQQDownloaderOpenSDK = mCb;
    GMTrace.o(12599286562816L, 93872);
    return localTMQQDownloaderOpenSDK;
  }
  
  public static void aFb()
  {
    boolean bool2 = false;
    GMTrace.i(12599420780544L, 93873);
    if (mCb == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      if (mCa == null) {
        bool2 = true;
      }
      w.i("MicroMsg.QQDownloaderSDKWrapper", "destroyQQDownloader, sdk is null : [%b], instance is null : [%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if (mCb != null) {
        mCb.destroyQQDownloaderOpenSDK();
      }
      mCb = null;
      mCa = null;
      GMTrace.o(12599420780544L, 93873);
      return;
    }
  }
  
  public static int g(Context paramContext, String paramString, int paramInt)
  {
    i = -1;
    GMTrace.i(12600091869184L, 93878);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, packageName is null");
      GMTrace.o(12600091869184L, 93878);
      return -1;
    }
    for (;;)
    {
      try
      {
        paramContext = p.getPackageInfo(paramContext, paramString);
        if (paramContext != null) {
          continue;
        }
        paramInt = 1;
      }
      catch (Exception paramContext)
      {
        int j;
        w.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, ex = %s", new Object[] { paramContext.getMessage() });
        paramInt = i;
        continue;
      }
      w.d("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState, ret = %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(12600091869184L, 93878);
      return paramInt;
      w.d("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState, installed versionCode = %d", new Object[] { Integer.valueOf(paramContext.versionCode) });
      j = paramContext.versionCode;
      if (j >= paramInt) {
        paramInt = 0;
      } else {
        paramInt = 2;
      }
    }
  }
  
  public static boolean registerListener(ITMQQDownloaderOpenSDKListener paramITMQQDownloaderOpenSDKListener)
  {
    GMTrace.i(12600360304640L, 93880);
    aEZ();
    boolean bool = aFa().registerListener(paramITMQQDownloaderOpenSDKListener);
    GMTrace.o(12600360304640L, 93880);
    return bool;
  }
  
  public static void startToAuthorized(Context paramContext, String paramString)
  {
    GMTrace.i(12600226086912L, 93879);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
      GMTrace.o(12600226086912L, 93879);
      return;
    }
    paramString = new a().zi(paramString);
    try
    {
      aEZ();
      aFa().startToAuthorized(paramContext, paramString, "1");
      GMTrace.o(12600226086912L, 93879);
      return;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.QQDownloaderSDKWrapper", "startToAuthorized fail, ex = %s", new Object[] { paramContext.getMessage() });
      GMTrace.o(12600226086912L, 93879);
    }
  }
  
  public static boolean unregisterListener(ITMQQDownloaderOpenSDKListener paramITMQQDownloaderOpenSDKListener)
  {
    GMTrace.i(12600494522368L, 93881);
    aEZ();
    boolean bool = aFa().unregisterListener(paramITMQQDownloaderOpenSDKListener);
    GMTrace.o(12600494522368L, 93881);
    return bool;
  }
  
  public static int zh(String paramString)
  {
    GMTrace.i(12599823433728L, 93876);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
      GMTrace.o(12599823433728L, 93876);
      return -1;
    }
    int i = a(new a().zi(paramString));
    GMTrace.o(12599823433728L, 93876);
    return i;
  }
  
  private static final class a
  {
    public String SNGAppId;
    public String actionFlag;
    public String mCc;
    public String taskApkId;
    public String taskAppId;
    public String taskPackageName;
    public int taskVersion;
    public String uin;
    public String uinType;
    public String via;
    
    public a()
    {
      GMTrace.i(12611903029248L, 93966);
      GMTrace.o(12611903029248L, 93966);
    }
    
    public final TMQQDownloaderOpenSDKParam zi(String paramString)
    {
      GMTrace.i(12612037246976L, 93967);
      w.i("MicroMsg.QQDownloaderSDKWrapper", "params is : [%s]", new Object[] { paramString });
      if (bg.mZ(paramString)) {
        w.e("MicroMsg.QQDownloaderSDKWrapper", "params is null or nil");
      }
      for (;;)
      {
        paramString = new TMQQDownloaderOpenSDKParam(this.SNGAppId, this.taskAppId, this.taskApkId, this.taskVersion, this.via, this.taskPackageName, this.uin, this.uinType, this.mCc, this.actionFlag);
        GMTrace.o(12612037246976L, 93967);
        return paramString;
        try
        {
          paramString = new JSONObject(paramString);
          this.taskApkId = paramString.optString("taskApkId");
          this.via = paramString.optString("via");
          this.taskVersion = paramString.optInt("taskVersion");
          this.mCc = paramString.optString("channelID");
          this.uin = paramString.optString("uin");
          this.SNGAppId = paramString.optString("SNGAppId");
          this.taskAppId = paramString.optString("taskAppId");
          this.uinType = paramString.optString("uinType");
          this.taskPackageName = paramString.optString("taskPackageName");
          this.actionFlag = paramString.optString("actionFlag");
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.QQDownloaderSDKWrapper", "parse parms failed:[%s]", new Object[] { paramString.getMessage() });
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */