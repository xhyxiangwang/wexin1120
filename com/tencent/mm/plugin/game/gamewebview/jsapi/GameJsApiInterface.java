package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public class GameJsApiInterface
{
  public Handler iLD;
  private Map<String, c> iPk;
  protected com.tencent.mm.plugin.game.gamewebview.ui.d muf;
  public JSONObject mug;
  public HashSet<String> muh;
  
  public GameJsApiInterface(com.tencent.mm.plugin.game.gamewebview.ui.d paramd)
  {
    GMTrace.i(17026189885440L, 126855);
    this.muh = new HashSet();
    this.muf = paramd;
    this.iPk = d.aCQ();
    paramd = new HandlerThread("GameWebviewAsyncJSThread");
    paramd.start();
    this.iLD = new Handler(paramd.getLooper());
    GMTrace.o(17026189885440L, 126855);
  }
  
  private static JSONObject pQ(String paramString)
  {
    GMTrace.i(17026726756352L, 126859);
    String str = paramString;
    try
    {
      if (bg.mZ(paramString)) {
        str = "{}";
      }
      paramString = new JSONObject(str);
      GMTrace.o(17026726756352L, 126859);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.GameJsApiInterface", paramString.getMessage());
      paramString = new JSONObject();
      GMTrace.o(17026726756352L, 126859);
    }
    return paramString;
  }
  
  private static String yK(String paramString)
  {
    GMTrace.i(17026592538624L, 126858);
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_msg", paramString);
    paramString = new JSONObject(localHashMap).toString();
    GMTrace.o(17026592538624L, 126858);
    return paramString;
  }
  
  /* Error */
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public String invokeHandler(final String paramString1, final String paramString2, final int paramInt, long paramLong)
  {
    // Byte code:
    //   0: ldc2_w 130
    //   3: ldc -124
    //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 138	java/lang/System:currentTimeMillis	()J
    //   11: lstore 7
    //   13: ldc 92
    //   15: ldc -116
    //   17: iconst_2
    //   18: anewarray 4	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: lload 7
    //   29: lload 4
    //   31: lsub
    //   32: invokestatic 146	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   35: aastore
    //   36: invokestatic 149	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: aload_1
    //   40: invokestatic 155	com/tencent/mm/plugin/game/gamewebview/a/b:yE	(Ljava/lang/String;)I
    //   43: istore 6
    //   45: iload 6
    //   47: ifle +17 -> 64
    //   50: getstatic 161	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   53: ldc2_w 162
    //   56: iload 6
    //   58: i2l
    //   59: lconst_1
    //   60: iconst_0
    //   61: invokevirtual 167	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   64: aload_0
    //   65: getfield 47	com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiInterface:iPk	Ljava/util/Map;
    //   68: aload_1
    //   69: invokeinterface 171 2 0
    //   74: instanceof 173
    //   77: istore 9
    //   79: iload 9
    //   81: ifeq +71 -> 152
    //   84: aload_0
    //   85: aload_1
    //   86: aload_2
    //   87: iload_3
    //   88: invokevirtual 177	com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiInterface:t	(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   91: astore 10
    //   93: aload_2
    //   94: ifnonnull +84 -> 178
    //   97: iconst_0
    //   98: istore_3
    //   99: ldc 92
    //   101: ldc -77
    //   103: iconst_4
    //   104: anewarray 4	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: aload_1
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: iload_3
    //   114: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   117: aastore
    //   118: dup
    //   119: iconst_2
    //   120: iload 9
    //   122: invokestatic 189	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   125: aastore
    //   126: dup
    //   127: iconst_3
    //   128: invokestatic 138	java/lang/System:currentTimeMillis	()J
    //   131: lload 7
    //   133: lsub
    //   134: invokestatic 146	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   137: aastore
    //   138: invokestatic 149	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: ldc2_w 130
    //   144: ldc -124
    //   146: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: aload 10
    //   151: areturn
    //   152: aload_0
    //   153: getfield 68	com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiInterface:iLD	Landroid/os/Handler;
    //   156: new 6	com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiInterface$1
    //   159: dup
    //   160: aload_0
    //   161: aload_1
    //   162: aload_2
    //   163: iload_3
    //   164: invokespecial 192	com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiInterface$1:<init>	(Lcom/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiInterface;Ljava/lang/String;Ljava/lang/String;I)V
    //   167: invokevirtual 196	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   170: pop
    //   171: ldc -58
    //   173: astore 10
    //   175: goto -82 -> 93
    //   178: aload_2
    //   179: invokevirtual 204	java/lang/String:length	()I
    //   182: istore_3
    //   183: goto -84 -> 99
    //   186: astore_2
    //   187: ldc 92
    //   189: ldc -50
    //   191: iconst_3
    //   192: anewarray 4	java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aload_1
    //   198: aastore
    //   199: dup
    //   200: iconst_1
    //   201: aload_2
    //   202: invokevirtual 96	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   205: aastore
    //   206: dup
    //   207: iconst_2
    //   208: aload_2
    //   209: invokevirtual 210	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   212: aastore
    //   213: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: aload_2
    //   217: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	GameJsApiInterface
    //   0	218	1	paramString1	String
    //   0	218	2	paramString2	String
    //   0	218	3	paramInt	int
    //   0	218	4	paramLong	long
    //   43	14	6	i	int
    //   11	121	7	l	long
    //   77	44	9	bool	boolean
    //   91	83	10	str	String
    // Exception table:
    //   from	to	target	type
    //   64	79	186	java/lang/Exception
    //   84	93	186	java/lang/Exception
    //   99	141	186	java/lang/Exception
    //   152	171	186	java/lang/Exception
    //   178	183	186	java/lang/Exception
  }
  
  public final String t(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(17026458320896L, 126857);
    if ((this.muf == null) || (this.muf.aDm() == null))
    {
      w.e("MicroMsg.GameJsApiInterface", "activity is null");
      GMTrace.o(17026458320896L, 126857);
      return "";
    }
    Object localObject = (c)this.iPk.get(paramString1);
    boolean bool2 = localObject instanceof e;
    paramString1 = pQ(paramString2);
    if (localObject == null) {
      paramString1 = yK("system:function_not_exist");
    }
    while (bool2)
    {
      GMTrace.o(17026458320896L, 126857);
      return paramString1;
      if (this.muh.contains(((c)localObject).getName())) {
        this.muh.remove(((c)localObject).getName());
      }
      for (boolean bool1 = true;; bool1 = this.muf.be(((c)localObject).getName(), ((c)localObject).aCM()))
      {
        if (bool1) {
          break label163;
        }
        paramString1 = yK("system:access_denied");
        break;
      }
      try
      {
        label163:
        if (this.mug != null)
        {
          if (!bg.mZ(this.mug.optString("srcUsername"))) {
            paramString1.put("src_username", this.mug.optString("srcUsername"));
          }
          if (!bg.mZ(this.mug.optString("srcDisplayname"))) {
            paramString1.put("src_displayname", this.mug.optString("srcDisplayname"));
          }
          if (!bg.mZ(this.mug.optString("KTemplateId"))) {
            paramString1.put("tempalate_id", this.mug.optString("KTemplateId"));
          }
          paramString1.put("message_id", this.mug.optLong("message_id"));
          paramString1.put("message_index", this.mug.optInt("message_index"));
          paramString1.put("webview_scene", this.mug.optInt("scene"));
          paramString1.put("stastic_scene", this.mug.optInt("stastic_scene"));
        }
        paramString1.put("current_url", this.muf.aDp());
        paramString1.put("current_appid", this.muf.aDq());
        if (bool2) {
          paramString1 = "";
        }
      }
      catch (Exception paramString2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.GameJsApiInterface", paramString2, "", new Object[0]);
        }
        paramString2 = (a)localObject;
        if (paramString2.aCO() == 2)
        {
          localObject = new GameJsApiActivityTask(this.muf.aDm());
          ((GameJsApiActivityTask)localObject).mtZ = this.muf;
          ((GameJsApiActivityTask)localObject).iQC = paramInt;
          ((GameJsApiActivityTask)localObject).muc = paramString2.getName();
          ((GameJsApiActivityTask)localObject).iSs = paramString1.toString();
          ((GameJsApiActivityTask)localObject).azb();
          paramString1 = null;
        }
        else if (paramString2.aCO() == 1)
        {
          localObject = new GameJsApiMMTask();
          ((GameJsApiMMTask)localObject).mtZ = this.muf;
          ((GameJsApiMMTask)localObject).iQC = paramInt;
          ((GameJsApiMMTask)localObject).muc = paramString2.getName();
          ((GameJsApiMMTask)localObject).iSs = paramString1.toString();
          ((GameJsApiMMTask)localObject).VD();
          GameWebViewMainProcessService.a((GWMainProcessTask)localObject);
          paramString1 = null;
        }
        else
        {
          paramString2.a(this.muf, paramString1, paramInt);
          paramString1 = null;
        }
      }
    }
    if (paramString1 != null) {
      this.muf.v(paramInt, paramString1);
    }
    GMTrace.o(17026458320896L, 126857);
    return "";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */