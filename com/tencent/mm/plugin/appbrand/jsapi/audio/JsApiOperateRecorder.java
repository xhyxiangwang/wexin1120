package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.a.a;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.media.b;
import com.tencent.mm.plugin.appbrand.media.d.6;
import com.tencent.mm.plugin.appbrand.media.d.7;
import com.tencent.mm.plugin.appbrand.media.d.8;
import com.tencent.mm.plugin.appbrand.media.d.a;
import com.tencent.mm.plugin.appbrand.media.g;
import com.tencent.mm.plugin.appbrand.media.record.RecordParam;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiOperateRecorder
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 295;
  public static final String NAME = "operateRecorder";
  public OperateRecordTask iSm;
  private AppBrandPageView iSn;
  private int iSo;
  
  public JsApiOperateRecorder()
  {
    GMTrace.i(19727455879168L, 146981);
    GMTrace.o(19727455879168L, 146981);
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19727590096896L, 146982);
    com.tencent.mm.plugin.appbrand.a.a(paramk.iqL, new a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(19732421935104L, 147018);
        if (paramAnonymousInt != 116)
        {
          GMTrace.o(19732421935104L, 147018);
          return;
        }
        if (paramAnonymousArrayOfInt[0] == 0)
        {
          w.i("MicroMsg.JsApiOperateRecorder", "PERMISSION_GRANTED, do invoke again");
          JsApiOperateRecorder.this.a(paramk, paramJSONObject, paramInt);
          GMTrace.o(19732421935104L, 147018);
          return;
        }
        w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, SYS_PERM_DENIED");
        paramk.v(paramInt, JsApiOperateRecorder.this.d("fail:system permission denied", null));
        GMTrace.o(19732421935104L, 147018);
      }
    });
    final Object localObject = a(paramk);
    int i;
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, pageContext is null");
      paramk.v(paramInt, d("fail", null));
      i = 0;
    }
    while (i == 0)
    {
      w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, requestPermission fail");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19727590096896L, 146982);
      return;
      boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)localObject, "android.permission.RECORD_AUDIO", 116, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nw(paramk.iqL);
        i = bool;
      }
    }
    this.iSn = b(paramk);
    if (this.iSn == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19727590096896L, 146982);
      return;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19727590096896L, 146982);
      return;
    }
    localObject = paramk.iqL;
    w.i("MicroMsg.JsApiOperateRecorder", "operateRecorder appId:%s, data:%s", new Object[] { localObject, paramJSONObject.toString() });
    if (this.iSm == null) {
      this.iSm = new OperateRecordTask(this, paramk, paramInt);
    }
    this.iSm.iQC = paramInt;
    this.iSm.appId = ((String)localObject);
    this.iSm.iSs = paramJSONObject.toString();
    paramk = new d.b()
    {
      public final void a(d.c paramAnonymousc)
      {
        GMTrace.i(19714839412736L, 146887);
        w.i("MicroMsg.JsApiOperateRecorder", "onPause, appId:%s", new Object[] { localObject });
        paramAnonymousc = new JSONObject();
        try
        {
          paramAnonymousc.put("operationType", "stop");
          if (JsApiOperateRecorder.this.iSm == null) {
            JsApiOperateRecorder.this.iSm = new JsApiOperateRecorder.OperateRecordTask(JsApiOperateRecorder.this, paramk, paramInt);
          }
          JsApiOperateRecorder.this.iSm.iSs = paramAnonymousc.toString();
          JsApiOperateRecorder.this.iSm.appId = localObject;
          JsApiOperateRecorder.this.iSm.action = -1;
          AppBrandMainProcessService.a(JsApiOperateRecorder.this.iSm);
          com.tencent.mm.plugin.appbrand.d.b(localObject, this);
          GMTrace.o(19714839412736L, 146887);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.JsApiOperateRecorder", localJSONException, "", new Object[0]);
          }
        }
      }
      
      public final void onDestroy()
      {
        GMTrace.i(19714973630464L, 146888);
        w.i("MicroMsg.JsApiOperateRecorder", "onDestroy, appId:%s", new Object[] { localObject });
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("operationType", "stop");
          if (JsApiOperateRecorder.this.iSm == null) {
            JsApiOperateRecorder.this.iSm = new JsApiOperateRecorder.OperateRecordTask(JsApiOperateRecorder.this, paramk, paramInt);
          }
          JsApiOperateRecorder.this.iSm.iSs = localJSONObject.toString();
          JsApiOperateRecorder.this.iSm.appId = localObject;
          JsApiOperateRecorder.this.iSm.action = -1;
          AppBrandMainProcessService.b(JsApiOperateRecorder.this.iSm);
          com.tencent.mm.plugin.appbrand.d.b(localObject, this);
          GMTrace.o(19714973630464L, 146888);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.JsApiOperateRecorder", localJSONException, "", new Object[0]);
          }
        }
      }
    };
    this.iSm.iRZ = paramk;
    AppBrandMainProcessService.a(this.iSm);
    GMTrace.o(19727590096896L, 146982);
  }
  
  public final void cd(final boolean paramBoolean)
  {
    GMTrace.i(19727724314624L, 146983);
    if (!af.isMainThread())
    {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19725039960064L, 146963);
          JsApiOperateRecorder.this.cd(paramBoolean);
          GMTrace.o(19725039960064L, 146963);
        }
      });
      GMTrace.o(19727724314624L, 146983);
      return;
    }
    if ((this.iSn == null) || (this.iSn.irS == null))
    {
      GMTrace.o(19727724314624L, 146983);
      return;
    }
    if (paramBoolean)
    {
      this.iSo = com.tencent.mm.plugin.appbrand.page.a.e(this.iSn.irS).iY(p.i.ixt);
      GMTrace.o(19727724314624L, 146983);
      return;
    }
    com.tencent.mm.plugin.appbrand.page.a.e(this.iSn.irS).iZ(this.iSo);
    GMTrace.o(19727724314624L, 146983);
  }
  
  private static class OperateRecordTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateRecordTask> CREATOR;
    public int action;
    public String appId;
    public int duration;
    public byte[] fIt;
    public boolean fIu;
    public String filePath;
    public int fileSize;
    public k iQB;
    public int iQC;
    public String iRD;
    public boolean iRF;
    public String iRS;
    d.b iRZ;
    private JsApiOperateRecorder iSr;
    public String iSs;
    private String iSt;
    String iSu;
    public int iSv;
    private final com.tencent.mm.sdk.b.c<kx> iSw;
    public String state;
    
    static
    {
      GMTrace.i(19744769966080L, 147110);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19744769966080L, 147110);
    }
    
    public OperateRecordTask(Parcel paramParcel)
    {
      GMTrace.i(19743964659712L, 147104);
      this.iRF = false;
      this.iRD = "";
      this.filePath = "";
      this.fileSize = 0;
      this.duration = 0;
      this.state = "";
      this.iSt = "";
      this.iSw = new com.tencent.mm.sdk.b.c()
      {
        /* Error */
        private boolean a(kx paramAnonymouskx)
        {
          // Byte code:
          //   0: ldc2_w 57
          //   3: ldc 59
          //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: ldc 61
          //   10: ldc 63
          //   12: iconst_1
          //   13: anewarray 65	java/lang/Object
          //   16: dup
          //   17: iconst_0
          //   18: aload_1
          //   19: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   22: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   25: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   28: aastore
          //   29: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   32: new 87	java/util/HashMap
          //   35: dup
          //   36: invokespecial 88	java/util/HashMap:<init>	()V
          //   39: astore 9
          //   41: aload 9
          //   43: ldc 90
          //   45: aload_1
          //   46: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   49: getfield 93	com/tencent/mm/g/a/kx$a:state	Ljava/lang/String;
          //   52: invokeinterface 99 3 0
          //   57: pop
          //   58: aload_0
          //   59: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   62: aload_1
          //   63: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   66: getfield 93	com/tencent/mm/g/a/kx$a:state	Ljava/lang/String;
          //   69: putfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
          //   72: aload_1
          //   73: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   76: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   79: iconst_2
          //   80: if_icmpne +55 -> 135
          //   83: aload_0
          //   84: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   87: aload_1
          //   88: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   91: getfield 103	com/tencent/mm/g/a/kx$a:filePath	Ljava/lang/String;
          //   94: putfield 104	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
          //   97: aload_0
          //   98: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   101: aload_1
          //   102: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   105: getfield 107	com/tencent/mm/g/a/kx$a:duration	I
          //   108: putfield 108	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:duration	I
          //   111: aload_0
          //   112: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   115: aload_1
          //   116: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   119: getfield 111	com/tencent/mm/g/a/kx$a:fileSize	I
          //   122: putfield 112	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fileSize	I
          //   125: aload_0
          //   126: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   129: getfield 115	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
          //   132: invokestatic 121	com/tencent/mm/plugin/appbrand/media/b:qO	(Ljava/lang/String;)V
          //   135: aload_1
          //   136: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   139: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   142: iconst_4
          //   143: if_icmpne +61 -> 204
          //   146: aload 9
          //   148: ldc 123
          //   150: aload_1
          //   151: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   154: getfield 125	com/tencent/mm/g/a/kx$a:errCode	I
          //   157: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   160: invokeinterface 99 3 0
          //   165: pop
          //   166: ldc 127
          //   168: astore 5
          //   170: aload_1
          //   171: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   174: getfield 130	com/tencent/mm/g/a/kx$a:ftU	Ljava/lang/String;
          //   177: invokestatic 136	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
          //   180: ifne +12 -> 192
          //   183: aload_1
          //   184: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   187: getfield 130	com/tencent/mm/g/a/kx$a:ftU	Ljava/lang/String;
          //   190: astore 5
          //   192: aload 9
          //   194: ldc -118
          //   196: aload 5
          //   198: invokeinterface 99 3 0
          //   203: pop
          //   204: aload_1
          //   205: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   208: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   211: iconst_5
          //   212: if_icmpne +236 -> 448
          //   215: aload_1
          //   216: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   219: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   222: ifnull +376 -> 598
          //   225: aload_1
          //   226: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   229: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   232: arraylength
          //   233: ldc -113
          //   235: if_icmple +363 -> 598
          //   238: aload_0
          //   239: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   242: astore 10
          //   244: invokestatic 149	java/lang/System:nanoTime	()J
          //   247: lstore_3
          //   248: aconst_null
          //   249: astore 8
          //   251: aconst_null
          //   252: astore 6
          //   254: aconst_null
          //   255: astore 7
          //   257: aload 6
          //   259: astore 5
          //   261: new 151	java/io/File
          //   264: dup
          //   265: aload 10
          //   267: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSu	Ljava/lang/String;
          //   270: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
          //   273: astore 11
          //   275: aload 6
          //   277: astore 5
          //   279: ldc 61
          //   281: ldc -98
          //   283: iconst_1
          //   284: anewarray 65	java/lang/Object
          //   287: dup
          //   288: iconst_0
          //   289: aload 10
          //   291: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSu	Ljava/lang/String;
          //   294: aastore
          //   295: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   298: aload 6
          //   300: astore 5
          //   302: aload 11
          //   304: invokevirtual 165	java/io/File:exists	()Z
          //   307: ifne +13 -> 320
          //   310: aload 6
          //   312: astore 5
          //   314: aload 11
          //   316: invokevirtual 168	java/io/File:createNewFile	()Z
          //   319: pop
          //   320: aload 6
          //   322: astore 5
          //   324: new 170	java/io/FileOutputStream
          //   327: dup
          //   328: aload 11
          //   330: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
          //   333: astore 6
          //   335: aload 6
          //   337: aload_1
          //   338: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   341: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   344: invokevirtual 177	java/io/FileOutputStream:write	([B)V
          //   347: aload 6
          //   349: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   352: aload 6
          //   354: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   357: ldc 61
          //   359: ldc -74
          //   361: iconst_1
          //   362: anewarray 65	java/lang/Object
          //   365: dup
          //   366: iconst_0
          //   367: invokestatic 149	java/lang/System:nanoTime	()J
          //   370: lload_3
          //   371: lsub
          //   372: invokestatic 187	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   375: aastore
          //   376: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   379: aload_0
          //   380: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   383: astore 5
          //   385: aload_1
          //   386: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   389: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   392: ifnull +223 -> 615
          //   395: aload_1
          //   396: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   399: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   402: arraylength
          //   403: istore_2
          //   404: aload 5
          //   406: iload_2
          //   407: putfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSv	I
          //   410: aload_0
          //   411: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   414: aload_1
          //   415: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   418: getfield 194	com/tencent/mm/g/a/kx$a:fIu	Z
          //   421: putfield 195	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIu	Z
          //   424: ldc 61
          //   426: ldc -59
          //   428: iconst_1
          //   429: anewarray 65	java/lang/Object
          //   432: dup
          //   433: iconst_0
          //   434: aload_0
          //   435: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   438: getfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSv	I
          //   441: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   444: aastore
          //   445: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   448: aload_0
          //   449: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   452: new 199	org/json/JSONObject
          //   455: dup
          //   456: aload 9
          //   458: invokespecial 202	org/json/JSONObject:<init>	(Ljava/util/Map;)V
          //   461: invokevirtual 205	org/json/JSONObject:toString	()Ljava/lang/String;
          //   464: putfield 208	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRS	Ljava/lang/String;
          //   467: aload_0
          //   468: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   471: aload_1
          //   472: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   475: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   478: putfield 209	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
          //   481: aload_0
          //   482: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   485: invokestatic 212	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;)Z
          //   488: pop
          //   489: ldc2_w 57
          //   492: ldc 59
          //   494: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   497: iconst_1
          //   498: ireturn
          //   499: astore 5
          //   501: aload 7
          //   503: astore 6
          //   505: aload 5
          //   507: astore 7
          //   509: aload 6
          //   511: astore 5
          //   513: ldc 61
          //   515: aload 7
          //   517: ldc 127
          //   519: iconst_0
          //   520: anewarray 65	java/lang/Object
          //   523: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   526: aload 6
          //   528: ifnull -171 -> 357
          //   531: aload 6
          //   533: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   536: goto -179 -> 357
          //   539: astore 5
          //   541: goto -184 -> 357
          //   544: astore 7
          //   546: aload 8
          //   548: astore 6
          //   550: aload 6
          //   552: astore 5
          //   554: ldc 61
          //   556: aload 7
          //   558: ldc 127
          //   560: iconst_0
          //   561: anewarray 65	java/lang/Object
          //   564: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   567: aload 6
          //   569: ifnull -212 -> 357
          //   572: aload 6
          //   574: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   577: goto -220 -> 357
          //   580: astore 5
          //   582: goto -225 -> 357
          //   585: astore_1
          //   586: aload 5
          //   588: ifnull +8 -> 596
          //   591: aload 5
          //   593: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   596: aload_1
          //   597: athrow
          //   598: aload_0
          //   599: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   602: aload_1
          //   603: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   606: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   609: putfield 217	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIt	[B
          //   612: goto -233 -> 379
          //   615: iconst_0
          //   616: istore_2
          //   617: goto -213 -> 404
          //   620: astore 5
          //   622: goto -265 -> 357
          //   625: astore 5
          //   627: goto -31 -> 596
          //   630: astore_1
          //   631: aload 6
          //   633: astore 5
          //   635: goto -49 -> 586
          //   638: astore 7
          //   640: goto -90 -> 550
          //   643: astore 7
          //   645: goto -136 -> 509
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	648	0	this	1
          //   0	648	1	paramAnonymouskx	kx
          //   403	214	2	i	int
          //   247	124	3	l	long
          //   168	237	5	localObject1	Object
          //   499	7	5	localFileNotFoundException1	java.io.FileNotFoundException
          //   511	1	5	localObject2	Object
          //   539	1	5	localIOException1	java.io.IOException
          //   552	1	5	localObject3	Object
          //   580	12	5	localIOException2	java.io.IOException
          //   620	1	5	localIOException3	java.io.IOException
          //   625	1	5	localIOException4	java.io.IOException
          //   633	1	5	localObject4	Object
          //   252	380	6	localObject5	Object
          //   255	261	7	localFileNotFoundException2	java.io.FileNotFoundException
          //   544	13	7	localIOException5	java.io.IOException
          //   638	1	7	localIOException6	java.io.IOException
          //   643	1	7	localFileNotFoundException3	java.io.FileNotFoundException
          //   249	298	8	localObject6	Object
          //   39	418	9	localHashMap	java.util.HashMap
          //   242	48	10	localOperateRecordTask	JsApiOperateRecorder.OperateRecordTask
          //   273	56	11	localFile	java.io.File
          // Exception table:
          //   from	to	target	type
          //   261	275	499	java/io/FileNotFoundException
          //   279	298	499	java/io/FileNotFoundException
          //   302	310	499	java/io/FileNotFoundException
          //   314	320	499	java/io/FileNotFoundException
          //   324	335	499	java/io/FileNotFoundException
          //   531	536	539	java/io/IOException
          //   261	275	544	java/io/IOException
          //   279	298	544	java/io/IOException
          //   302	310	544	java/io/IOException
          //   314	320	544	java/io/IOException
          //   324	335	544	java/io/IOException
          //   572	577	580	java/io/IOException
          //   261	275	585	finally
          //   279	298	585	finally
          //   302	310	585	finally
          //   314	320	585	finally
          //   324	335	585	finally
          //   513	526	585	finally
          //   554	567	585	finally
          //   352	357	620	java/io/IOException
          //   591	596	625	java/io/IOException
          //   335	352	630	finally
          //   335	352	638	java/io/IOException
          //   335	352	643	java/io/FileNotFoundException
        }
      };
      f(paramParcel);
      GMTrace.o(19743964659712L, 147104);
    }
    
    public OperateRecordTask(JsApiOperateRecorder paramJsApiOperateRecorder, k paramk, int paramInt)
    {
      GMTrace.i(19743830441984L, 147103);
      this.iRF = false;
      this.iRD = "";
      this.filePath = "";
      this.fileSize = 0;
      this.duration = 0;
      this.state = "";
      this.iSt = "";
      this.iSw = new com.tencent.mm.sdk.b.c()
      {
        /* Error */
        private boolean a(kx paramAnonymouskx)
        {
          // Byte code:
          //   0: ldc2_w 57
          //   3: ldc 59
          //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: ldc 61
          //   10: ldc 63
          //   12: iconst_1
          //   13: anewarray 65	java/lang/Object
          //   16: dup
          //   17: iconst_0
          //   18: aload_1
          //   19: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   22: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   25: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   28: aastore
          //   29: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   32: new 87	java/util/HashMap
          //   35: dup
          //   36: invokespecial 88	java/util/HashMap:<init>	()V
          //   39: astore 9
          //   41: aload 9
          //   43: ldc 90
          //   45: aload_1
          //   46: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   49: getfield 93	com/tencent/mm/g/a/kx$a:state	Ljava/lang/String;
          //   52: invokeinterface 99 3 0
          //   57: pop
          //   58: aload_0
          //   59: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   62: aload_1
          //   63: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   66: getfield 93	com/tencent/mm/g/a/kx$a:state	Ljava/lang/String;
          //   69: putfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
          //   72: aload_1
          //   73: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   76: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   79: iconst_2
          //   80: if_icmpne +55 -> 135
          //   83: aload_0
          //   84: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   87: aload_1
          //   88: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   91: getfield 103	com/tencent/mm/g/a/kx$a:filePath	Ljava/lang/String;
          //   94: putfield 104	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
          //   97: aload_0
          //   98: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   101: aload_1
          //   102: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   105: getfield 107	com/tencent/mm/g/a/kx$a:duration	I
          //   108: putfield 108	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:duration	I
          //   111: aload_0
          //   112: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   115: aload_1
          //   116: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   119: getfield 111	com/tencent/mm/g/a/kx$a:fileSize	I
          //   122: putfield 112	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fileSize	I
          //   125: aload_0
          //   126: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   129: getfield 115	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
          //   132: invokestatic 121	com/tencent/mm/plugin/appbrand/media/b:qO	(Ljava/lang/String;)V
          //   135: aload_1
          //   136: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   139: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   142: iconst_4
          //   143: if_icmpne +61 -> 204
          //   146: aload 9
          //   148: ldc 123
          //   150: aload_1
          //   151: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   154: getfield 125	com/tencent/mm/g/a/kx$a:errCode	I
          //   157: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   160: invokeinterface 99 3 0
          //   165: pop
          //   166: ldc 127
          //   168: astore 5
          //   170: aload_1
          //   171: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   174: getfield 130	com/tencent/mm/g/a/kx$a:ftU	Ljava/lang/String;
          //   177: invokestatic 136	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
          //   180: ifne +12 -> 192
          //   183: aload_1
          //   184: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   187: getfield 130	com/tencent/mm/g/a/kx$a:ftU	Ljava/lang/String;
          //   190: astore 5
          //   192: aload 9
          //   194: ldc -118
          //   196: aload 5
          //   198: invokeinterface 99 3 0
          //   203: pop
          //   204: aload_1
          //   205: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   208: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   211: iconst_5
          //   212: if_icmpne +236 -> 448
          //   215: aload_1
          //   216: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   219: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   222: ifnull +376 -> 598
          //   225: aload_1
          //   226: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   229: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   232: arraylength
          //   233: ldc -113
          //   235: if_icmple +363 -> 598
          //   238: aload_0
          //   239: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   242: astore 10
          //   244: invokestatic 149	java/lang/System:nanoTime	()J
          //   247: lstore_3
          //   248: aconst_null
          //   249: astore 8
          //   251: aconst_null
          //   252: astore 6
          //   254: aconst_null
          //   255: astore 7
          //   257: aload 6
          //   259: astore 5
          //   261: new 151	java/io/File
          //   264: dup
          //   265: aload 10
          //   267: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSu	Ljava/lang/String;
          //   270: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
          //   273: astore 11
          //   275: aload 6
          //   277: astore 5
          //   279: ldc 61
          //   281: ldc -98
          //   283: iconst_1
          //   284: anewarray 65	java/lang/Object
          //   287: dup
          //   288: iconst_0
          //   289: aload 10
          //   291: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSu	Ljava/lang/String;
          //   294: aastore
          //   295: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   298: aload 6
          //   300: astore 5
          //   302: aload 11
          //   304: invokevirtual 165	java/io/File:exists	()Z
          //   307: ifne +13 -> 320
          //   310: aload 6
          //   312: astore 5
          //   314: aload 11
          //   316: invokevirtual 168	java/io/File:createNewFile	()Z
          //   319: pop
          //   320: aload 6
          //   322: astore 5
          //   324: new 170	java/io/FileOutputStream
          //   327: dup
          //   328: aload 11
          //   330: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
          //   333: astore 6
          //   335: aload 6
          //   337: aload_1
          //   338: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   341: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   344: invokevirtual 177	java/io/FileOutputStream:write	([B)V
          //   347: aload 6
          //   349: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   352: aload 6
          //   354: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   357: ldc 61
          //   359: ldc -74
          //   361: iconst_1
          //   362: anewarray 65	java/lang/Object
          //   365: dup
          //   366: iconst_0
          //   367: invokestatic 149	java/lang/System:nanoTime	()J
          //   370: lload_3
          //   371: lsub
          //   372: invokestatic 187	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   375: aastore
          //   376: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   379: aload_0
          //   380: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   383: astore 5
          //   385: aload_1
          //   386: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   389: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   392: ifnull +223 -> 615
          //   395: aload_1
          //   396: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   399: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   402: arraylength
          //   403: istore_2
          //   404: aload 5
          //   406: iload_2
          //   407: putfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSv	I
          //   410: aload_0
          //   411: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   414: aload_1
          //   415: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   418: getfield 194	com/tencent/mm/g/a/kx$a:fIu	Z
          //   421: putfield 195	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIu	Z
          //   424: ldc 61
          //   426: ldc -59
          //   428: iconst_1
          //   429: anewarray 65	java/lang/Object
          //   432: dup
          //   433: iconst_0
          //   434: aload_0
          //   435: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   438: getfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSv	I
          //   441: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   444: aastore
          //   445: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   448: aload_0
          //   449: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   452: new 199	org/json/JSONObject
          //   455: dup
          //   456: aload 9
          //   458: invokespecial 202	org/json/JSONObject:<init>	(Ljava/util/Map;)V
          //   461: invokevirtual 205	org/json/JSONObject:toString	()Ljava/lang/String;
          //   464: putfield 208	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRS	Ljava/lang/String;
          //   467: aload_0
          //   468: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   471: aload_1
          //   472: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   475: getfield 74	com/tencent/mm/g/a/kx$a:action	I
          //   478: putfield 209	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
          //   481: aload_0
          //   482: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   485: invokestatic 212	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;)Z
          //   488: pop
          //   489: ldc2_w 57
          //   492: ldc 59
          //   494: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   497: iconst_1
          //   498: ireturn
          //   499: astore 5
          //   501: aload 7
          //   503: astore 6
          //   505: aload 5
          //   507: astore 7
          //   509: aload 6
          //   511: astore 5
          //   513: ldc 61
          //   515: aload 7
          //   517: ldc 127
          //   519: iconst_0
          //   520: anewarray 65	java/lang/Object
          //   523: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   526: aload 6
          //   528: ifnull -171 -> 357
          //   531: aload 6
          //   533: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   536: goto -179 -> 357
          //   539: astore 5
          //   541: goto -184 -> 357
          //   544: astore 7
          //   546: aload 8
          //   548: astore 6
          //   550: aload 6
          //   552: astore 5
          //   554: ldc 61
          //   556: aload 7
          //   558: ldc 127
          //   560: iconst_0
          //   561: anewarray 65	java/lang/Object
          //   564: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   567: aload 6
          //   569: ifnull -212 -> 357
          //   572: aload 6
          //   574: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   577: goto -220 -> 357
          //   580: astore 5
          //   582: goto -225 -> 357
          //   585: astore_1
          //   586: aload 5
          //   588: ifnull +8 -> 596
          //   591: aload 5
          //   593: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   596: aload_1
          //   597: athrow
          //   598: aload_0
          //   599: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iSx	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   602: aload_1
          //   603: getfield 69	com/tencent/mm/g/a/kx:fIs	Lcom/tencent/mm/g/a/kx$a;
          //   606: getfield 142	com/tencent/mm/g/a/kx$a:fIt	[B
          //   609: putfield 217	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIt	[B
          //   612: goto -233 -> 379
          //   615: iconst_0
          //   616: istore_2
          //   617: goto -213 -> 404
          //   620: astore 5
          //   622: goto -265 -> 357
          //   625: astore 5
          //   627: goto -31 -> 596
          //   630: astore_1
          //   631: aload 6
          //   633: astore 5
          //   635: goto -49 -> 586
          //   638: astore 7
          //   640: goto -90 -> 550
          //   643: astore 7
          //   645: goto -136 -> 509
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	648	0	this	1
          //   0	648	1	paramAnonymouskx	kx
          //   403	214	2	i	int
          //   247	124	3	l	long
          //   168	237	5	localObject1	Object
          //   499	7	5	localFileNotFoundException1	java.io.FileNotFoundException
          //   511	1	5	localObject2	Object
          //   539	1	5	localIOException1	java.io.IOException
          //   552	1	5	localObject3	Object
          //   580	12	5	localIOException2	java.io.IOException
          //   620	1	5	localIOException3	java.io.IOException
          //   625	1	5	localIOException4	java.io.IOException
          //   633	1	5	localObject4	Object
          //   252	380	6	localObject5	Object
          //   255	261	7	localFileNotFoundException2	java.io.FileNotFoundException
          //   544	13	7	localIOException5	java.io.IOException
          //   638	1	7	localIOException6	java.io.IOException
          //   643	1	7	localFileNotFoundException3	java.io.FileNotFoundException
          //   249	298	8	localObject6	Object
          //   39	418	9	localHashMap	java.util.HashMap
          //   242	48	10	localOperateRecordTask	JsApiOperateRecorder.OperateRecordTask
          //   273	56	11	localFile	java.io.File
          // Exception table:
          //   from	to	target	type
          //   261	275	499	java/io/FileNotFoundException
          //   279	298	499	java/io/FileNotFoundException
          //   302	310	499	java/io/FileNotFoundException
          //   314	320	499	java/io/FileNotFoundException
          //   324	335	499	java/io/FileNotFoundException
          //   531	536	539	java/io/IOException
          //   261	275	544	java/io/IOException
          //   279	298	544	java/io/IOException
          //   302	310	544	java/io/IOException
          //   314	320	544	java/io/IOException
          //   324	335	544	java/io/IOException
          //   572	577	580	java/io/IOException
          //   261	275	585	finally
          //   279	298	585	finally
          //   302	310	585	finally
          //   314	320	585	finally
          //   324	335	585	finally
          //   513	526	585	finally
          //   554	567	585	finally
          //   352	357	620	java/io/IOException
          //   591	596	625	java/io/IOException
          //   335	352	630	finally
          //   335	352	638	java/io/IOException
          //   335	352	643	java/io/FileNotFoundException
        }
      };
      this.iSr = paramJsApiOperateRecorder;
      this.iQB = paramk;
      this.iQC = paramInt;
      this.iSu = com.tencent.mm.plugin.appbrand.appstorage.c.aD(paramk.iqL, "frameBuffer");
      GMTrace.o(19743830441984L, 147103);
    }
    
    public final void RS()
    {
      int i = 0;
      int k = 0;
      int j = 0;
      GMTrace.i(19744098877440L, 147105);
      Object localObject2;
      try
      {
        JSONObject localJSONObject = new JSONObject(this.iSs);
        localObject2 = localJSONObject.optString("operationType");
        if (TextUtils.isEmpty((CharSequence)localObject2))
        {
          w.e("MicroMsg.JsApiOperateRecorder", "operationType is null");
          this.iRF = true;
          this.action = -1;
          this.iRD = "operationType is null";
          VC();
          GMTrace.o(19744098877440L, 147105);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiOperateRecorder", "new json exists exception, data is invalid, dataStr:%s", new Object[] { this.iSs });
        this.iRF = true;
        this.action = -1;
        this.iRD = "parser data fail, data is invalid";
        w.e("MicroMsg.JsApiOperateRecorder", "exception:%s" + localJSONException.getMessage());
        VC();
        GMTrace.o(19744098877440L, 147105);
        return;
      }
      w.i("MicroMsg.JsApiOperateRecorder", "operationType;%s", new Object[] { localObject2 });
      this.iRF = false;
      this.action = -1;
      Object localObject1;
      if (((String)localObject2).equals("start"))
      {
        i = localJSONException.optInt("duration", 60000);
        k = localJSONException.optInt("sampleRate", 44100);
        int m = localJSONException.optInt("numberOfChannels", 2);
        int n = localJSONException.optInt("encodeBitRate", 128000);
        localObject2 = localJSONException.optString("format");
        int i1 = localJSONException.optInt("frameSize", 0);
        b.a(this.appId, this.iSw);
        localObject1 = new RecordParam();
        ((RecordParam)localObject1).duration = i;
        ((RecordParam)localObject1).sampleRate = k;
        ((RecordParam)localObject1).jhW = m;
        ((RecordParam)localObject1).jhX = n;
        ((RecordParam)localObject1).iSt = ((String)localObject2);
        ((RecordParam)localObject1).scene = 8;
        ((RecordParam)localObject1).jhY = i1;
        ((RecordParam)localObject1).gKm = System.currentTimeMillis();
        this.iSt = ((String)localObject2);
        localObject2 = f.Sl();
        w.i("MicroMsg.AudioRecordMgr", "startRecord");
        if (((com.tencent.mm.plugin.appbrand.media.d)localObject2).jhk)
        {
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, is recording");
          i = j;
          if (i == 0) {
            break label824;
          }
          w.i("MicroMsg.JsApiOperateRecorder", "star record ok");
          this.action = -1;
        }
      }
      for (;;)
      {
        if (this.iRF) {
          w.e("MicroMsg.JsApiOperateRecorder", this.iRD);
        }
        VC();
        GMTrace.o(19744098877440L, 147105);
        return;
        if (((com.tencent.mm.plugin.appbrand.media.d)localObject2).qp())
        {
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, is pause");
          i = j;
          break;
        }
        if ((TextUtils.isEmpty(((RecordParam)localObject1).iSt)) || (((RecordParam)localObject1).duration < 0) || (((RecordParam)localObject1).jhX <= 0) || (((RecordParam)localObject1).sampleRate <= 0) || (((RecordParam)localObject1).jhW <= 0)) {}
        for (i = 0;; i = 1)
        {
          if (i != 0) {
            break label521;
          }
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, param is invalid");
          g.iT(15);
          i = j;
          break;
        }
        label521:
        if (!com.tencent.mm.plugin.appbrand.media.e.qS(((RecordParam)localObject1).iSt))
        {
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, encode format %s is not support!", new Object[] { ((RecordParam)localObject1).iSt });
          g.iT(16);
          i = j;
          break;
        }
        if (TextUtils.isEmpty(((RecordParam)localObject1).gKm)) {
          ((RecordParam)localObject1).gKm = System.currentTimeMillis();
        }
        g.Yw();
        w.i("MicroMsg.RecordParamCompatibility", "recordParam duration:%d, numberOfChannels:%d, sampleRate:%d, encodeBitRate:%d", new Object[] { Integer.valueOf(((RecordParam)localObject1).duration), Integer.valueOf(((RecordParam)localObject1).jhW), Integer.valueOf(((RecordParam)localObject1).sampleRate), Integer.valueOf(((RecordParam)localObject1).jhX) });
        if (((RecordParam)localObject1).duration <= 0)
        {
          ((RecordParam)localObject1).duration = 60000;
          label670:
          if ((((RecordParam)localObject1).jhW <= 0) && (((RecordParam)localObject1).jhW > 2)) {
            ((RecordParam)localObject1).jhW = 2;
          }
          if (((RecordParam)localObject1).sampleRate <= 48000) {
            break label780;
          }
          ((RecordParam)localObject1).sampleRate = 48000;
          label712:
          if (((RecordParam)localObject1).jhX <= 320000) {
            break label802;
          }
          ((RecordParam)localObject1).jhX = 320000;
        }
        for (;;)
        {
          ((com.tencent.mm.plugin.appbrand.media.d)localObject2).jhm = ((RecordParam)localObject1);
          com.tencent.mm.sdk.f.e.post(new d.6((com.tencent.mm.plugin.appbrand.media.d)localObject2), "app_brand_start_record");
          i = 1;
          break;
          if (((RecordParam)localObject1).duration < 600000) {
            break label670;
          }
          ((RecordParam)localObject1).duration = 600000;
          break label670;
          label780:
          if (((RecordParam)localObject1).sampleRate >= 8000) {
            break label712;
          }
          ((RecordParam)localObject1).sampleRate = 8000;
          break label712;
          label802:
          if (((RecordParam)localObject1).jhX < 16000) {
            ((RecordParam)localObject1).jhX = 16000;
          }
        }
        label824:
        if (f.Sl().jhk)
        {
          this.iRF = true;
          this.iRD = "audio is recording, don't start record again";
        }
        else
        {
          this.iRF = true;
          this.iRD = "start record fail";
          continue;
          if (((String)localObject2).equals("resume"))
          {
            localObject1 = f.Sl();
            if (((com.tencent.mm.plugin.appbrand.media.d)localObject1).jhk) {
              w.e("MicroMsg.AudioRecordMgr", "resumeRecord fail, is recording");
            }
            for (;;)
            {
              if (i == 0) {
                break label959;
              }
              this.action = -1;
              w.i("MicroMsg.JsApiOperateRecorder", "resume record ok");
              break;
              if (((com.tencent.mm.plugin.appbrand.media.d)localObject1).jhm == null)
              {
                w.e("MicroMsg.AudioRecordMgr", "resumeRecord fail, mRecordParam is null");
              }
              else
              {
                g.Yw();
                com.tencent.mm.sdk.f.e.post(new d.7((com.tencent.mm.plugin.appbrand.media.d)localObject1), "app_brand_resume_record");
                i = 1;
              }
            }
            label959:
            if (f.Sl().jhk)
            {
              this.iRF = true;
              this.iRD = "audio is recording, don't resume record again";
            }
            else
            {
              this.iRF = true;
              this.iRD = "resume record fail";
            }
          }
          else if (((String)localObject2).equals("pause"))
          {
            localObject1 = f.Sl();
            w.i("MicroMsg.AudioRecordMgr", "pauseRecord");
            if (((com.tencent.mm.plugin.appbrand.media.d)localObject1).jhj == null) {
              w.e("MicroMsg.AudioRecordMgr", "mRecord is null");
            }
            for (i = k;; i = 1)
            {
              if (i == 0) {
                break label1082;
              }
              this.action = -1;
              w.i("MicroMsg.JsApiOperateRecorder", "pause record ok");
              break;
              com.tencent.mm.sdk.f.e.post(new d.8((com.tencent.mm.plugin.appbrand.media.d)localObject1), "app_brand_pause_record");
            }
            label1082:
            if (f.Sl().qp())
            {
              this.iRF = true;
              this.iRD = "audio is pause, don't pause record again";
            }
            else
            {
              this.iRF = true;
              this.iRD = "pause record fail";
            }
          }
          else if (((String)localObject2).equals("stop"))
          {
            if (f.Sl().qr())
            {
              this.action = -1;
              w.i("MicroMsg.JsApiOperateRecorder", "stop record ok");
            }
            else
            {
              if (f.Sl().jhn == d.a.jhB) {}
              for (i = 1;; i = 0)
              {
                if (i == 0) {
                  break label1195;
                }
                this.iRF = true;
                this.iRD = "audio is stop, don't stop record again";
                break;
              }
              label1195:
              this.iRF = true;
              this.iRD = "stop record fail";
            }
          }
          else
          {
            w.e("MicroMsg.JsApiOperateRecorder", "operationType is invalid");
            this.iRF = true;
            this.iRD = "operationType is invalid";
          }
        }
      }
    }
    
    /* Error */
    public final void VB()
    {
      // Byte code:
      //   0: ldc2_w 401
      //   3: ldc_w 403
      //   6: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: aload_0
      //   10: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQB	Lcom/tencent/mm/plugin/appbrand/k;
      //   13: ifnonnull +21 -> 34
      //   16: ldc -103
      //   18: ldc_w 405
      //   21: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   24: ldc2_w 401
      //   27: ldc_w 403
      //   30: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   33: return
      //   34: aload_0
      //   35: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   38: iconst_m1
      //   39: if_icmpne +118 -> 157
      //   42: aload_0
      //   43: getfield 70	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRF	Z
      //   46: ifne +43 -> 89
      //   49: ldc -103
      //   51: ldc_w 407
      //   54: invokestatic 269	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   57: aload_0
      //   58: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQB	Lcom/tencent/mm/plugin/appbrand/k;
      //   61: aload_0
      //   62: getfield 102	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQC	I
      //   65: aload_0
      //   66: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSr	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   69: ldc_w 409
      //   72: aconst_null
      //   73: invokevirtual 415	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   76: invokevirtual 419	com/tencent/mm/plugin/appbrand/k:v	(ILjava/lang/String;)V
      //   79: ldc2_w 401
      //   82: ldc_w 403
      //   85: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   88: return
      //   89: ldc -103
      //   91: ldc_w 421
      //   94: iconst_1
      //   95: anewarray 167	java/lang/Object
      //   98: dup
      //   99: iconst_0
      //   100: aload_0
      //   101: getfield 74	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRD	Ljava/lang/String;
      //   104: aastore
      //   105: invokestatic 170	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   108: aload_0
      //   109: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQB	Lcom/tencent/mm/plugin/appbrand/k;
      //   112: aload_0
      //   113: getfield 102	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQC	I
      //   116: aload_0
      //   117: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSr	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   120: new 174	java/lang/StringBuilder
      //   123: dup
      //   124: ldc_w 423
      //   127: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   130: aload_0
      //   131: getfield 74	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRD	Ljava/lang/String;
      //   134: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   137: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   140: aconst_null
      //   141: invokevirtual 415	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   144: invokevirtual 419	com/tencent/mm/plugin/appbrand/k:v	(ILjava/lang/String;)V
      //   147: ldc2_w 401
      //   150: ldc_w 403
      //   153: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   156: return
      //   157: new 425	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$a
      //   160: dup
      //   161: invokespecial 426	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$a:<init>	()V
      //   164: astore 8
      //   166: aload_0
      //   167: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   170: tableswitch	default:+34->204, 0:+510->680, 1:+510->680, 2:+532->702, 3:+532->702, 4:+532->702
      //   204: aload_0
      //   205: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   208: iconst_2
      //   209: if_icmpne +174 -> 383
      //   212: new 428	java/util/HashMap
      //   215: dup
      //   216: invokespecial 429	java/util/HashMap:<init>	()V
      //   219: astore 4
      //   221: aload 4
      //   223: ldc_w 430
      //   226: aload_0
      //   227: getfield 82	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
      //   230: invokeinterface 436 3 0
      //   235: pop
      //   236: ldc -103
      //   238: ldc_w 438
      //   241: iconst_2
      //   242: anewarray 167	java/lang/Object
      //   245: dup
      //   246: iconst_0
      //   247: aload_0
      //   248: getfield 76	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
      //   251: aastore
      //   252: dup
      //   253: iconst_1
      //   254: aload_0
      //   255: getfield 84	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSt	Ljava/lang/String;
      //   258: aastore
      //   259: invokestatic 192	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   262: aload_0
      //   263: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQB	Lcom/tencent/mm/plugin/appbrand/k;
      //   266: getfield 107	com/tencent/mm/plugin/appbrand/k:iqL	Ljava/lang/String;
      //   269: astore 5
      //   271: aload_0
      //   272: getfield 76	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
      //   275: astore 6
      //   277: aload_0
      //   278: getfield 84	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSt	Ljava/lang/String;
      //   281: astore_3
      //   282: aload_3
      //   283: invokestatic 151	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
      //   286: ifne +472 -> 758
      //   289: ldc_w 440
      //   292: aload_3
      //   293: invokevirtual 443	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
      //   296: ifeq +428 -> 724
      //   299: ldc_w 445
      //   302: astore_3
      //   303: aload 5
      //   305: aload 6
      //   307: aload_3
      //   308: iconst_0
      //   309: invokestatic 449	com/tencent/mm/plugin/appbrand/appstorage/c:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject;
      //   312: astore_3
      //   313: aload_3
      //   314: ifnull +450 -> 764
      //   317: aload 4
      //   319: ldc_w 451
      //   322: aload_3
      //   323: getfield 456	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:fAx	Ljava/lang/String;
      //   326: invokeinterface 436 3 0
      //   331: pop
      //   332: aload 4
      //   334: ldc -55
      //   336: aload_0
      //   337: getfield 80	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:duration	I
      //   340: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   343: invokeinterface 436 3 0
      //   348: pop
      //   349: aload 4
      //   351: ldc_w 457
      //   354: aload_0
      //   355: getfield 78	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fileSize	I
      //   358: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   361: invokeinterface 436 3 0
      //   366: pop
      //   367: aload_0
      //   368: new 134	org/json/JSONObject
      //   371: dup
      //   372: aload 4
      //   374: invokespecial 460	org/json/JSONObject:<init>	(Ljava/util/Map;)V
      //   377: invokevirtual 461	org/json/JSONObject:toString	()Ljava/lang/String;
      //   380: putfield 463	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRS	Ljava/lang/String;
      //   383: aload_0
      //   384: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   387: iconst_5
      //   388: if_icmpne +230 -> 618
      //   391: new 428	java/util/HashMap
      //   394: dup
      //   395: invokespecial 429	java/util/HashMap:<init>	()V
      //   398: astore 9
      //   400: aload 9
      //   402: ldc_w 430
      //   405: aload_0
      //   406: getfield 82	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
      //   409: invokeinterface 436 3 0
      //   414: pop
      //   415: aload 9
      //   417: ldc_w 465
      //   420: aload_0
      //   421: getfield 467	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIu	Z
      //   424: invokestatic 472	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   427: invokeinterface 436 3 0
      //   432: pop
      //   433: aload_0
      //   434: getfield 474	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSv	I
      //   437: ldc_w 475
      //   440: if_icmple +124 -> 564
      //   443: invokestatic 478	java/lang/System:nanoTime	()J
      //   446: lstore_1
      //   447: aconst_null
      //   448: astore 5
      //   450: aconst_null
      //   451: astore 4
      //   453: aconst_null
      //   454: astore 7
      //   456: new 480	java/io/File
      //   459: dup
      //   460: aload_0
      //   461: getfield 117	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSu	Ljava/lang/String;
      //   464: invokespecial 481	java/io/File:<init>	(Ljava/lang/String;)V
      //   467: astore_3
      //   468: aload 4
      //   470: astore 5
      //   472: aload_3
      //   473: astore 6
      //   475: aload_3
      //   476: invokevirtual 484	java/io/File:exists	()Z
      //   479: ifeq +309 -> 788
      //   482: aload 4
      //   484: astore 5
      //   486: aload_3
      //   487: astore 6
      //   489: new 486	java/io/FileInputStream
      //   492: dup
      //   493: aload_3
      //   494: invokespecial 489	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   497: astore 4
      //   499: aload_0
      //   500: aload_0
      //   501: getfield 474	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSv	I
      //   504: newarray <illegal type>
      //   506: putfield 491	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIt	[B
      //   509: aload 4
      //   511: aload_0
      //   512: getfield 491	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIt	[B
      //   515: invokevirtual 495	java/io/FileInputStream:read	([B)I
      //   518: pop
      //   519: aload 4
      //   521: invokevirtual 498	java/io/FileInputStream:close	()V
      //   524: aload 4
      //   526: invokevirtual 498	java/io/FileInputStream:close	()V
      //   529: aload_3
      //   530: invokevirtual 484	java/io/File:exists	()Z
      //   533: ifeq +296 -> 829
      //   536: aload_3
      //   537: invokevirtual 501	java/io/File:delete	()Z
      //   540: pop
      //   541: ldc -103
      //   543: ldc_w 503
      //   546: iconst_1
      //   547: anewarray 167	java/lang/Object
      //   550: dup
      //   551: iconst_0
      //   552: invokestatic 478	java/lang/System:nanoTime	()J
      //   555: lload_1
      //   556: lsub
      //   557: invokestatic 508	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   560: aastore
      //   561: invokestatic 510	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   564: aload_0
      //   565: getfield 491	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIt	[B
      //   568: ifnull +441 -> 1009
      //   571: aload 9
      //   573: ldc 109
      //   575: aload_0
      //   576: getfield 491	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fIt	[B
      //   579: invokestatic 516	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
      //   582: invokeinterface 436 3 0
      //   587: pop
      //   588: aload_0
      //   589: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQB	Lcom/tencent/mm/plugin/appbrand/k;
      //   592: aload 9
      //   594: aload 8
      //   596: invokestatic 521	com/tencent/mm/plugin/appbrand/o/l:a	(Lcom/tencent/mm/plugin/appbrand/k;Ljava/util/Map;Lcom/tencent/mm/plugin/appbrand/jsapi/b;)Z
      //   599: ifeq +19 -> 618
      //   602: aload_0
      //   603: new 134	org/json/JSONObject
      //   606: dup
      //   607: aload 9
      //   609: invokespecial 460	org/json/JSONObject:<init>	(Ljava/util/Map;)V
      //   612: invokevirtual 461	org/json/JSONObject:toString	()Ljava/lang/String;
      //   615: putfield 463	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRS	Ljava/lang/String;
      //   618: ldc -103
      //   620: ldc_w 523
      //   623: iconst_2
      //   624: anewarray 167	java/lang/Object
      //   627: dup
      //   628: iconst_0
      //   629: aload_0
      //   630: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   633: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   636: aastore
      //   637: dup
      //   638: iconst_1
      //   639: aload_0
      //   640: getfield 463	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRS	Ljava/lang/String;
      //   643: aastore
      //   644: invokestatic 192	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   647: aload 8
      //   649: aload_0
      //   650: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iQB	Lcom/tencent/mm/plugin/appbrand/k;
      //   653: invokevirtual 526	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$a:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/c;)Lcom/tencent/mm/plugin/appbrand/jsapi/e;
      //   656: astore_3
      //   657: aload_3
      //   658: aload_0
      //   659: getfield 463	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRS	Ljava/lang/String;
      //   662: putfield 531	com/tencent/mm/plugin/appbrand/jsapi/e:mData	Ljava/lang/String;
      //   665: aload_3
      //   666: invokevirtual 534	com/tencent/mm/plugin/appbrand/jsapi/e:VI	()Z
      //   669: pop
      //   670: ldc2_w 401
      //   673: ldc_w 403
      //   676: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   679: return
      //   680: aload_0
      //   681: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSr	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   684: iconst_1
      //   685: invokevirtual 538	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder:cd	(Z)V
      //   688: aload_0
      //   689: getfield 220	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
      //   692: aload_0
      //   693: getfield 540	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRZ	Lcom/tencent/mm/plugin/appbrand/d$b;
      //   696: invokestatic 545	com/tencent/mm/plugin/appbrand/d:a	(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/d$b;)V
      //   699: goto -495 -> 204
      //   702: aload_0
      //   703: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iSr	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   706: iconst_0
      //   707: invokevirtual 538	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder:cd	(Z)V
      //   710: aload_0
      //   711: getfield 220	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
      //   714: aload_0
      //   715: getfield 540	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iRZ	Lcom/tencent/mm/plugin/appbrand/d$b;
      //   718: invokestatic 547	com/tencent/mm/plugin/appbrand/d:b	(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/d$b;)V
      //   721: goto -517 -> 204
      //   724: ldc_w 549
      //   727: aload_3
      //   728: invokevirtual 443	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
      //   731: ifeq +10 -> 741
      //   734: ldc_w 549
      //   737: astore_3
      //   738: goto -435 -> 303
      //   741: ldc_w 551
      //   744: aload_3
      //   745: invokevirtual 443	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
      //   748: ifeq +10 -> 758
      //   751: ldc_w 551
      //   754: astore_3
      //   755: goto -452 -> 303
      //   758: ldc 72
      //   760: astore_3
      //   761: goto -458 -> 303
      //   764: ldc -103
      //   766: ldc_w 553
      //   769: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   772: aload 4
      //   774: ldc_w 451
      //   777: ldc 72
      //   779: invokeinterface 436 3 0
      //   784: pop
      //   785: goto -453 -> 332
      //   788: aload 4
      //   790: astore 5
      //   792: aload_3
      //   793: astore 6
      //   795: ldc -103
      //   797: ldc_w 555
      //   800: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   803: aload_3
      //   804: invokevirtual 484	java/io/File:exists	()Z
      //   807: ifeq +11 -> 818
      //   810: aload_3
      //   811: invokevirtual 501	java/io/File:delete	()Z
      //   814: pop
      //   815: goto -251 -> 564
      //   818: ldc -103
      //   820: ldc_w 557
      //   823: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   826: goto -262 -> 564
      //   829: ldc -103
      //   831: ldc_w 557
      //   834: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   837: goto -296 -> 541
      //   840: astore 5
      //   842: aconst_null
      //   843: astore 4
      //   845: aconst_null
      //   846: astore_3
      //   847: ldc -103
      //   849: aload 5
      //   851: ldc 72
      //   853: iconst_0
      //   854: anewarray 167	java/lang/Object
      //   857: invokestatic 561	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   860: aload_3
      //   861: ifnull +7 -> 868
      //   864: aload_3
      //   865: invokevirtual 498	java/io/FileInputStream:close	()V
      //   868: aload 4
      //   870: ifnull +20 -> 890
      //   873: aload 4
      //   875: invokevirtual 484	java/io/File:exists	()Z
      //   878: ifeq +12 -> 890
      //   881: aload 4
      //   883: invokevirtual 501	java/io/File:delete	()Z
      //   886: pop
      //   887: goto -346 -> 541
      //   890: ldc -103
      //   892: ldc_w 557
      //   895: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   898: goto -357 -> 541
      //   901: astore 4
      //   903: aconst_null
      //   904: astore_3
      //   905: aload 7
      //   907: astore 5
      //   909: aload_3
      //   910: astore 6
      //   912: ldc -103
      //   914: aload 4
      //   916: ldc 72
      //   918: iconst_0
      //   919: anewarray 167	java/lang/Object
      //   922: invokestatic 561	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   925: aload 7
      //   927: ifnull +8 -> 935
      //   930: aload 7
      //   932: invokevirtual 498	java/io/FileInputStream:close	()V
      //   935: aload_3
      //   936: ifnull +18 -> 954
      //   939: aload_3
      //   940: invokevirtual 484	java/io/File:exists	()Z
      //   943: ifeq +11 -> 954
      //   946: aload_3
      //   947: invokevirtual 501	java/io/File:delete	()Z
      //   950: pop
      //   951: goto -410 -> 541
      //   954: ldc -103
      //   956: ldc_w 557
      //   959: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   962: goto -421 -> 541
      //   965: astore 4
      //   967: aconst_null
      //   968: astore_3
      //   969: aload 5
      //   971: ifnull +8 -> 979
      //   974: aload 5
      //   976: invokevirtual 498	java/io/FileInputStream:close	()V
      //   979: aload_3
      //   980: ifnull +18 -> 998
      //   983: aload_3
      //   984: invokevirtual 484	java/io/File:exists	()Z
      //   987: ifeq +11 -> 998
      //   990: aload_3
      //   991: invokevirtual 501	java/io/File:delete	()Z
      //   994: pop
      //   995: aload 4
      //   997: athrow
      //   998: ldc -103
      //   1000: ldc_w 557
      //   1003: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   1006: goto -11 -> 995
      //   1009: ldc -103
      //   1011: ldc_w 563
      //   1014: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   1017: goto -429 -> 588
      //   1020: astore 4
      //   1022: goto -493 -> 529
      //   1025: astore_3
      //   1026: goto -158 -> 868
      //   1029: astore 4
      //   1031: goto -96 -> 935
      //   1034: astore 5
      //   1036: goto -57 -> 979
      //   1039: astore 4
      //   1041: aload 6
      //   1043: astore_3
      //   1044: goto -75 -> 969
      //   1047: astore 6
      //   1049: aload 4
      //   1051: astore 5
      //   1053: aload 6
      //   1055: astore 4
      //   1057: goto -88 -> 969
      //   1060: astore 5
      //   1062: aload 4
      //   1064: astore 6
      //   1066: aload 5
      //   1068: astore 4
      //   1070: aload_3
      //   1071: astore 5
      //   1073: aload 6
      //   1075: astore_3
      //   1076: goto -107 -> 969
      //   1079: astore 4
      //   1081: goto -176 -> 905
      //   1084: astore 5
      //   1086: aload 4
      //   1088: astore 7
      //   1090: aload 5
      //   1092: astore 4
      //   1094: goto -189 -> 905
      //   1097: astore 5
      //   1099: aconst_null
      //   1100: astore 6
      //   1102: aload_3
      //   1103: astore 4
      //   1105: aload 6
      //   1107: astore_3
      //   1108: goto -261 -> 847
      //   1111: astore 5
      //   1113: aload_3
      //   1114: astore 6
      //   1116: aload 4
      //   1118: astore_3
      //   1119: aload 6
      //   1121: astore 4
      //   1123: goto -276 -> 847
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1126	0	this	OperateRecordTask
      //   446	110	1	l	long
      //   281	710	3	localObject1	Object
      //   1025	1	3	localIOException1	java.io.IOException
      //   1043	76	3	localObject2	Object
      //   219	663	4	localObject3	Object
      //   901	14	4	localIOException2	java.io.IOException
      //   965	31	4	localObject4	Object
      //   1020	1	4	localIOException3	java.io.IOException
      //   1029	1	4	localIOException4	java.io.IOException
      //   1039	11	4	localObject5	Object
      //   1055	14	4	localObject6	Object
      //   1079	8	4	localIOException5	java.io.IOException
      //   1092	30	4	localObject7	Object
      //   269	522	5	localObject8	Object
      //   840	10	5	localFileNotFoundException1	java.io.FileNotFoundException
      //   907	68	5	localObject9	Object
      //   1034	1	5	localIOException6	java.io.IOException
      //   1051	1	5	localObject10	Object
      //   1060	7	5	localObject11	Object
      //   1071	1	5	localObject12	Object
      //   1084	7	5	localIOException7	java.io.IOException
      //   1097	1	5	localFileNotFoundException2	java.io.FileNotFoundException
      //   1111	1	5	localFileNotFoundException3	java.io.FileNotFoundException
      //   275	767	6	localObject13	Object
      //   1047	7	6	localObject14	Object
      //   1064	56	6	localObject15	Object
      //   454	635	7	localIOException8	java.io.IOException
      //   164	484	8	locala	JsApiOperateRecorder.a
      //   398	210	9	localHashMap	java.util.HashMap
      // Exception table:
      //   from	to	target	type
      //   456	468	840	java/io/FileNotFoundException
      //   456	468	901	java/io/IOException
      //   456	468	965	finally
      //   524	529	1020	java/io/IOException
      //   864	868	1025	java/io/IOException
      //   930	935	1029	java/io/IOException
      //   974	979	1034	java/io/IOException
      //   475	482	1039	finally
      //   489	499	1039	finally
      //   795	803	1039	finally
      //   912	925	1039	finally
      //   499	524	1047	finally
      //   847	860	1060	finally
      //   475	482	1079	java/io/IOException
      //   489	499	1079	java/io/IOException
      //   795	803	1079	java/io/IOException
      //   499	524	1084	java/io/IOException
      //   475	482	1097	java/io/FileNotFoundException
      //   489	499	1097	java/io/FileNotFoundException
      //   795	803	1097	java/io/FileNotFoundException
      //   499	524	1111	java/io/FileNotFoundException
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19744367312896L, 147107);
      this.appId = paramParcel.readString();
      this.iSs = paramParcel.readString();
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        this.iRF = bool1;
        this.iRD = paramParcel.readString();
        this.iRS = paramParcel.readString();
        this.action = paramParcel.readInt();
        this.filePath = paramParcel.readString();
        this.fileSize = paramParcel.readInt();
        this.duration = paramParcel.readInt();
        this.state = paramParcel.readString();
        this.iSt = paramParcel.readString();
        this.fIt = paramParcel.createByteArray();
        this.iSv = paramParcel.readInt();
        if (paramParcel.readByte() != 1) {
          break label160;
        }
      }
      label160:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.fIu = bool1;
        this.iSu = paramParcel.readString();
        GMTrace.o(19744367312896L, 147107);
        return;
        bool1 = false;
        break;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      GMTrace.i(19744501530624L, 147108);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.iSs);
      if (this.iRF)
      {
        paramInt = 1;
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.iRD);
        paramParcel.writeString(this.iRS);
        paramParcel.writeInt(this.action);
        paramParcel.writeString(this.filePath);
        paramParcel.writeInt(this.fileSize);
        paramParcel.writeInt(this.duration);
        paramParcel.writeString(this.state);
        paramParcel.writeString(this.iSt);
        paramParcel.writeByteArray(this.fIt);
        paramParcel.writeInt(this.iSv);
        if (!this.fIu) {
          break label159;
        }
      }
      label159:
      for (paramInt = i;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        paramParcel.writeString(this.iSu);
        GMTrace.o(19744501530624L, 147108);
        return;
        paramInt = 0;
        break;
      }
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 296;
    private static final String NAME = "onRecorderStateChange";
    
    public a()
    {
      GMTrace.i(19731482411008L, 147011);
      GMTrace.o(19731482411008L, 147011);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */