package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.a.c.i;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.io.File;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 274;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "addToEmoticon";
  
  public c()
  {
    GMTrace.i(17034242949120L, 126915);
    GMTrace.o(17034242949120L, 126915);
  }
  
  public final void a(final Context paramContext, final String paramString, final GameJsApiMMTask.a parama)
  {
    GMTrace.i(17034377166848L, 126916);
    w.i("MicroMsg.GameJsApiAddToEmotion", "invoke");
    paramString = com.tencent.mm.plugin.game.gamewebview.a.d.pQ(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.GameJsApiAddToEmotion", "bundle is null");
      parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail_null_data", null));
      GMTrace.o(17034377166848L, 126916);
      return;
    }
    Object localObject1 = paramString.optString("base64DataString");
    final String str = paramString.optString("thumbUrl");
    paramString = paramString.optString("url");
    Object localObject2;
    if (!bg.mZ((String)localObject1))
    {
      w.i("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon use base64DataString");
      int i = ((String)localObject1).indexOf(";base64,");
      paramString = "";
      if (i != -1) {
        paramString = ((String)localObject1).substring(i + 8, ((String)localObject1).length());
      }
      try
      {
        paramString = Base64.decode(paramString, 0);
        if (bg.bp(paramString))
        {
          parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
          GMTrace.o(17034377166848L, 126916);
          return;
        }
      }
      catch (Exception paramContext)
      {
        w.e("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon error:" + paramContext.getMessage());
        parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
        GMTrace.o(17034377166848L, 126916);
        return;
      }
      localObject1 = com.tencent.mm.a.g.n(paramString);
      ap.AS();
      localObject2 = EmojiLogic.F(com.tencent.mm.x.c.zc(), "", (String)localObject1);
      if ((!e.aZ((String)localObject2)) || (!com.tencent.mm.a.g.bg((String)localObject2).equalsIgnoreCase((String)localObject1))) {
        e.b((String)localObject2, paramString, paramString.length);
      }
      a(paramContext, (String)localObject1, str, parama);
      GMTrace.o(17034377166848L, 126916);
      return;
    }
    if (!bg.mZ(paramString))
    {
      w.i("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon use url:%s", new Object[] { paramString });
      localObject1 = new File(paramContext.getCacheDir(), com.tencent.mm.a.g.n(paramString.getBytes()));
      if (((File)localObject1).exists())
      {
        paramString = com.tencent.mm.a.g.h((File)localObject1);
        ap.AS();
        localObject2 = EmojiLogic.F(com.tencent.mm.x.c.zc(), "", paramString);
        if (!FileOp.aZ((String)localObject2)) {
          FileOp.o(((File)localObject1).getAbsolutePath(), (String)localObject2);
        }
        a(paramContext, paramString, str, parama);
        GMTrace.o(17034377166848L, 126916);
        return;
      }
      localObject2 = new c.a();
      ((c.a)localObject2).hCP = true;
      ((c.a)localObject2).hCR = ((File)localObject1).getAbsolutePath();
      ((c.a)localObject2).hDr = new Object[] { ((File)localObject1).getAbsolutePath() };
      localObject1 = ((c.a)localObject2).Jk();
      h.apQ().a(paramString, null, (com.tencent.mm.an.a.a.c)localObject1, new i()
      {
        public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(17060281188352L, 127109);
          w.i("MicroMsg.GameJsApiAddToEmotion", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramAnonymousString });
          if ((paramAnonymousBitmap != null) && (paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0))
          {
            if ((paramAnonymousVarArgs[0] != null) && ((paramAnonymousVarArgs[0] instanceof String)))
            {
              if (paramAnonymousString.equals(paramString))
              {
                paramAnonymousString = new File(paramAnonymousVarArgs[0].toString());
                if (paramAnonymousString.exists())
                {
                  paramAnonymousBitmap = com.tencent.mm.a.g.h(paramAnonymousString);
                  ap.AS();
                  paramAnonymousVarArgs = EmojiLogic.F(com.tencent.mm.x.c.zc(), "", paramAnonymousBitmap);
                  FileOp.o(paramAnonymousString.getAbsolutePath(), paramAnonymousVarArgs);
                  c.this.a(paramContext, paramAnonymousBitmap, str, parama);
                  GMTrace.o(17060281188352L, 127109);
                  return;
                }
                paramAnonymousString = parama;
                paramAnonymousBitmap = c.this;
                paramAnonymousString.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
                GMTrace.o(17060281188352L, 127109);
                return;
              }
              paramAnonymousString = parama;
              paramAnonymousBitmap = c.this;
              paramAnonymousString.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
              GMTrace.o(17060281188352L, 127109);
              return;
            }
            paramAnonymousString = parama;
            paramAnonymousBitmap = c.this;
            paramAnonymousString.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
            GMTrace.o(17060281188352L, 127109);
            return;
          }
          paramAnonymousString = parama;
          paramAnonymousBitmap = c.this;
          paramAnonymousString.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
          GMTrace.o(17060281188352L, 127109);
        }
      });
      GMTrace.o(17034377166848L, 126916);
      return;
    }
    w.e("MicroMsg.GameJsApiAddToEmotion", "doAddToEmoticon base64DataString is null and url is null");
    parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail_base64DataString_and_url_is_null", null));
    GMTrace.o(17034377166848L, 126916);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, GameJsApiMMTask.a parama)
  {
    GMTrace.i(17034511384576L, 126917);
    ap.AS();
    String str = EmojiLogic.F(com.tencent.mm.x.c.zc(), "", paramString1);
    EmojiInfo localEmojiInfo2 = h.aqs().kXu.TQ(paramString1);
    EmojiInfo localEmojiInfo1 = localEmojiInfo2;
    if (localEmojiInfo2 == null)
    {
      localEmojiInfo1 = localEmojiInfo2;
      if (e.aZ(str)) {
        if (!o.QO(str)) {
          break label204;
        }
      }
    }
    label204:
    for (int i = EmojiInfo.vgq;; i = EmojiInfo.vgp)
    {
      localEmojiInfo1 = new EmojiInfo();
      localEmojiInfo1.field_md5 = paramString1;
      localEmojiInfo1.field_catalog = EmojiInfo.vgi;
      localEmojiInfo1.field_type = i;
      localEmojiInfo1.field_size = e.aY(str);
      localEmojiInfo1.field_temp = 1;
      localEmojiInfo1.field_thumbUrl = paramString2;
      h.aqs().kXu.n(localEmojiInfo1);
      if (localEmojiInfo1 == null) {
        break label235;
      }
      boolean bool = h.aqo().a(paramContext, localEmojiInfo1, 18, m.zF());
      w.i("MicroMsg.GameJsApiAddToEmotion", "doAddAction %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:ok", null));
      GMTrace.o(17034511384576L, 126917);
      return;
    }
    parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
    GMTrace.o(17034511384576L, 126917);
    return;
    label235:
    parama.qb(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("addToEmoticon:fail", null));
    GMTrace.o(17034511384576L, 126917);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */