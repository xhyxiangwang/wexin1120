package com.tencent.mm.plugin.wallet_core.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.protocal.c.arg;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.sdk.e.i<aa>
{
  public static final String[] gMz;
  private e gMB;
  
  static
  {
    GMTrace.i(6913420951552L, 51509);
    gMz = new String[] { com.tencent.mm.sdk.e.i.a(aa.gLR, "WalletRegionGreyAreaList") };
    GMTrace.o(6913420951552L, 51509);
  }
  
  public i(e parame)
  {
    super(parame, aa.gLR, "WalletRegionGreyAreaList", null);
    GMTrace.i(6913018298368L, 51506);
    this.gMB = parame;
    GMTrace.o(6913018298368L, 51506);
  }
  
  public final void a(int paramInt, arg paramarg)
  {
    GMTrace.i(6913152516096L, 51507);
    aa localaa = new aa();
    localaa.field_wallet_region = paramInt;
    try
    {
      localaa.field_wallet_grey_item_buf = paramarg.toByteArray();
      super.a(localaa);
      GMTrace.o(6913152516096L, 51507);
      return;
    }
    catch (Exception paramarg)
    {
      for (;;)
      {
        w.e("MicroMsg.WalletRegionGreyItemStg", "setWalletRegionGreyItem error " + paramarg.getMessage());
      }
    }
  }
  
  public final aa wA(int paramInt)
  {
    GMTrace.i(6913286733824L, 51508);
    Object localObject = "select * from WalletRegionGreyAreaList where wallet_region = " + paramInt;
    Cursor localCursor = this.gMB.a((String)localObject, null, 2);
    w.i("MicroMsg.WalletRegionGreyItemStg", "getWalletRegionGreyItem " + (String)localObject);
    if (localCursor == null)
    {
      localObject = new aa();
      GMTrace.o(6913286733824L, 51508);
      return (aa)localObject;
    }
    localObject = new aa();
    if (localCursor.moveToNext())
    {
      localObject = new aa();
      ((aa)localObject).b(localCursor);
    }
    w.i("MicroMsg.WalletRegionGreyItemStg", "get grey item ");
    localCursor.close();
    GMTrace.o(6913286733824L, 51508);
    return (aa)localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */