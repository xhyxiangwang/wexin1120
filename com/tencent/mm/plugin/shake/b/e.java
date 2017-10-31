package com.tencent.mm.plugin.shake.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends i<d>
{
  public static final String[] gMz;
  public com.tencent.mm.sdk.e.e gMB;
  
  static
  {
    GMTrace.i(6505667493888L, 48471);
    gMz = new String[] { i.a(d.gLR, "shakeitem1") };
    GMTrace.o(6505667493888L, 48471);
  }
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.gLR, "shakeitem1", null);
    GMTrace.i(6504325316608L, 48461);
    this.gMB = parame;
    w.d("MicroMsg.NewShakeItemStorage", "ShakeItemStorage");
    parame.eL("shakeitem1", "DROP INDEX IF EXISTS shakeItemUsernameIndex ");
    parame.eL("shakeitem1", "CREATE INDEX IF NOT EXISTS shakeItemNewUsernameIndex ON shakeitem1 ( username )");
    GMTrace.o(6504325316608L, 48461);
  }
  
  public final int Fw(String paramString)
  {
    GMTrace.i(6504996405248L, 48466);
    int i = this.gMB.delete("shakeitem1", "(username=?)", new String[] { paramString });
    if (i > 0) {
      doNotify();
    }
    w.i("MicroMsg.NewShakeItemStorage", "delByusername:" + paramString + " result:" + i);
    GMTrace.o(6504996405248L, 48466);
    return i;
  }
  
  public final boolean a(d paramd, boolean paramBoolean)
  {
    GMTrace.i(6504727969792L, 48464);
    if (paramd == null)
    {
      GMTrace.o(6504727969792L, 48464);
      return false;
    }
    if ((!paramBoolean) && (!bg.mZ(paramd.field_username))) {
      Fw(paramd.field_username);
    }
    paramd.fJg = -1;
    paramBoolean = super.b(paramd);
    GMTrace.o(6504727969792L, 48464);
    return paramBoolean;
  }
  
  public final Cursor bdl()
  {
    GMTrace.i(6504459534336L, 48462);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", new String[] { "4" });
    GMTrace.o(6504459534336L, 48462);
    return localCursor;
  }
  
  public final d bdm()
  {
    GMTrace.i(6504593752064L, 48463);
    d locald = new d();
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc limit 1", new String[0]);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locald.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(6504593752064L, 48463);
    return locald;
  }
  
  public final boolean bdn()
  {
    GMTrace.i(6505264840704L, 48468);
    boolean bool = this.gMB.eL("shakeitem1", "delete from shakeitem1");
    doNotify();
    GMTrace.o(6505264840704L, 48468);
    return bool;
  }
  
  public final void bdo()
  {
    GMTrace.i(6505399058432L, 48469);
    w.i("MicroMsg.NewShakeItemStorage", "setAllOld");
    d locald = new d();
    locald.field_insertBatch = 0;
    locald.fJg = 1024;
    if (-1 != this.gMB.update("shakeitem1", locald.qQ(), "insertBatch!=?", new String[] { "0" })) {
      doNotify();
    }
    GMTrace.o(6505399058432L, 48469);
  }
  
  public final int tw(int paramInt)
  {
    GMTrace.i(6504862187520L, 48465);
    int i = this.gMB.delete("shakeitem1", "shakeItemID=?", new String[] { String.valueOf(paramInt) });
    doNotify();
    w.i("MicroMsg.NewShakeItemStorage", "delById id:" + paramInt + " result:" + i);
    GMTrace.o(6504862187520L, 48465);
    return i;
  }
  
  public final boolean tx(int paramInt)
  {
    GMTrace.i(6505130622976L, 48467);
    if (paramInt == 0) {}
    for (boolean bool = this.gMB.eL("shakeitem1", "delete from shakeitem1 where type = " + paramInt + " or type is null");; bool = this.gMB.eL("shakeitem1", "delete from shakeitem1 where type = " + paramInt))
    {
      doNotify();
      GMTrace.o(6505130622976L, 48467);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */