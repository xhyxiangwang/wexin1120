package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.libwebp;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.c;
import java.util.Map;

final class w
{
  DexLoader xyA = null;
  private String xyB = "TbsDexOpt";
  private String xyC = null;
  private Context xyw = null;
  private Context xyx = null;
  private String xyy = null;
  private String[] xyz = null;
  
  public w(Context paramContext1, Context paramContext2, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, o paramo)
  {
    TbsLog.i("TbsWizard", "construction start...");
    if ((paramContext1 == null) || ((paramContext2 == null) && (t.clr() == null)) || (TextUtils.isEmpty(paramString1)) || (paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      throw new Exception("TbsWizard paramter error:-1callerContext:" + paramContext1 + "hostcontext" + paramContext2 + "isEmpty" + TextUtils.isEmpty(paramString1) + "dexfileList" + paramArrayOfString);
    }
    this.xyw = paramContext1.getApplicationContext();
    this.xyx = paramContext2;
    this.xyy = paramString1;
    this.xyz = paramArrayOfString;
    this.xyB = paramString2;
    if (paramo != null) {
      paramo.a("load_tbs_dex", (byte)1);
    }
    this.xyA = new DexLoader(paramString3, this.xyw, this.xyz, paramString2, QbSdk.xvE);
    if (paramo != null) {
      paramo.a("load_tbs_dex", (byte)2);
    }
    libwebp.loadWepLibraryIfNeed(paramContext2, this.xyy);
    if ("com.nd.android.pandahome2".equals(this.xyw.getApplicationInfo().packageName))
    {
      paramContext2 = this.xyA;
      paramString1 = this.xyw;
      paramContext2.invokeStaticMethod("com.tencent.tbs.common.beacon.X5CoreBeaconUploader", "getInstance", new Class[] { Context.class }, new Object[] { paramString1 });
    }
    if (QbSdk.xvE != null)
    {
      paramContext2 = this.xyA;
      paramString1 = QbSdk.xvE;
      paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[] { Map.class }, new Object[] { paramString1 });
    }
    if (paramo != null) {
      paramo.a("init_tbs", (byte)1);
    }
    paramContext2 = this.xyA;
    paramString1 = c.aGY;
    paramString2 = c.xzG;
    paramArrayOfString = c.xzH;
    paramString3 = c.aKT;
    paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "putInfo", new Class[] { Context.class, String.class, String.class, String.class, String.class }, new Object[] { paramContext1, paramString1, paramString2, paramArrayOfString, paramString3 });
    String str1;
    String str2;
    int i;
    if ((this.xyx == null) && (t.clr() != null))
    {
      paramContext2 = this.xyA;
      paramString1 = Integer.TYPE;
      paramString2 = this.xyx;
      paramArrayOfString = this.xyA;
      paramString3 = this.xyy;
      str1 = this.xyB;
      str2 = QbSdk.ckz();
      String str3 = t.clr();
      paramContext2 = paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, paramString1, String.class, String.class }, new Object[] { paramContext1, paramString2, paramArrayOfString, paramString3, str1, "3.6.0.1026", Integer.valueOf(43601), str2, str3 });
      paramString1 = paramContext2;
      if (paramContext2 == null)
      {
        this.xyA.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "setTesSdkVersionName", new Class[] { String.class }, new Object[] { "3.6.0.1026" });
        this.xyA.setStaticField("com.tencent.tbs.tbsshell.TBSShell", "VERSION", Integer.valueOf(43601));
        paramContext2 = this.xyA;
        paramString1 = this.xyx;
        paramString2 = this.xyA;
        paramArrayOfString = this.xyy;
        paramString3 = this.xyB;
        paramString1 = paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class }, new Object[] { paramContext1, paramString1, paramString2, paramArrayOfString, paramString3 });
      }
      if (paramString1 != null) {
        break label1042;
      }
      i = -3;
      label746:
      if (i >= 0) {
        break label1099;
      }
      paramContext1 = this.xyA.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
      if ((paramContext1 instanceof Throwable))
      {
        paramContext2 = (Throwable)paramContext1;
        this.xyC = ("#" + paramContext2.getMessage() + "; cause: " + paramContext2.getCause() + "; th: " + paramContext2);
      }
      if (!(paramContext1 instanceof String)) {}
    }
    label1042:
    label1099:
    for (this.xyC = ((String)paramContext1);; this.xyC = null)
    {
      if (paramo != null) {
        paramo.a("init_tbs", (byte)2);
      }
      if (i >= 0) {
        break label1107;
      }
      throw new Exception("TbsWizard init error: " + i + "; msg: " + this.xyC);
      paramContext2 = this.xyA;
      paramString1 = Integer.TYPE;
      paramString2 = this.xyx;
      paramArrayOfString = this.xyA;
      paramString3 = this.xyy;
      str1 = this.xyB;
      str2 = QbSdk.ckz();
      paramContext2 = paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, paramString1, String.class }, new Object[] { paramContext1, paramString2, paramArrayOfString, paramString3, str1, "3.6.0.1026", Integer.valueOf(43601), str2 });
      break;
      if ((paramString1 instanceof Integer))
      {
        i = ((Integer)paramString1).intValue();
        break label746;
      }
      if ((paramString1 instanceof Throwable))
      {
        i.ckL().a(this.xyw, 328, (Throwable)paramString1);
        i = -5;
        break label746;
      }
      i = -4;
      break label746;
    }
    label1107:
    TbsLog.i("TbsWizard", "construction end...");
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */