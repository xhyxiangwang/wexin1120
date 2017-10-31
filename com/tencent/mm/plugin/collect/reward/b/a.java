package com.tencent.mm.plugin.collect.reward.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.h.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;

public final class a
  implements h.a
{
  public static final String kLl;
  private static a kLm;
  private String filename;
  public Map<String, a> gMM;
  
  static
  {
    GMTrace.i(19380503052288L, 144396);
    kLl = com.tencent.mm.loader.stub.a.gZP + "wallet/img/";
    GMTrace.o(19380503052288L, 144396);
  }
  
  public a()
  {
    GMTrace.i(19379563528192L, 144389);
    GMTrace.o(19379563528192L, 144389);
  }
  
  public static a anM()
  {
    GMTrace.i(19379697745920L, 144390);
    if (kLm == null) {
      kLm = new a();
    }
    a locala = kLm;
    GMTrace.o(19379697745920L, 144390);
    return locala;
  }
  
  public final int a(final String paramString, final int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, final keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
  {
    GMTrace.i(19380100399104L, 144393);
    w.i("MicroMsg.QrRewardCdnDownloadHelper", "cdn callback, id: %s, ret: %s, sceneResult: %s", new Object[] { paramString, Integer.valueOf(paramInt), paramkeep_SceneResult });
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19379429310464L, 144388);
        a.a locala = (a.a)a.this.gMM.get(paramString);
        if (locala != null)
        {
          if (paramkeep_SceneResult != null)
          {
            int i = paramkeep_SceneResult.field_retCode;
            locala.A(paramString, paramInt, i);
            a.this.gMM.remove(paramString);
            GMTrace.o(19379429310464L, 144388);
            return;
          }
          w.v("MicroMsg.QrRewardCdnDownloadHelper", "download is not end");
          GMTrace.o(19379429310464L, 144388);
          return;
        }
        w.w("MicroMsg.QrRewardCdnDownloadHelper", "no callback");
        GMTrace.o(19379429310464L, 144388);
      }
    });
    GMTrace.o(19380100399104L, 144393);
    return 0;
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    GMTrace.i(19380234616832L, 144394);
    GMTrace.o(19380234616832L, 144394);
  }
  
  public final boolean anN()
  {
    GMTrace.i(19379831963648L, 144391);
    boolean bool = new File(kLl + anO()).exists();
    GMTrace.o(19379831963648L, 144391);
    return bool;
  }
  
  public final String anO()
  {
    GMTrace.i(19379966181376L, 144392);
    if (bg.mZ(this.filename)) {
      this.filename = aa.QW(m.zF() + "_reward_img");
    }
    String str = this.filename;
    GMTrace.o(19379966181376L, 144392);
    return str;
  }
  
  public final byte[] h(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(19380368834560L, 144395);
    GMTrace.o(19380368834560L, 144395);
    return new byte[0];
  }
  
  public static abstract interface a
  {
    public abstract void A(String paramString, int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */