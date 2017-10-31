package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dr;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.arg;
import com.tencent.mm.protocal.c.bor;
import com.tencent.mm.protocal.c.bot;
import com.tencent.mm.protocal.c.bou;
import com.tencent.mm.protocal.c.bow;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class aa
  extends dr
{
  public static c.a gLR;
  public String nwU;
  private arg rRd;
  public bor rRe;
  public bou rRf;
  public boolean rRg;
  public String rRh;
  public String rRi;
  public String rRj;
  public String rRk;
  
  static
  {
    GMTrace.i(6888322236416L, 51322);
    c.a locala = new c.a();
    locala.hRR = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_region";
    locala.uQH.put("wallet_region", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" wallet_region INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "wallet_region";
    locala.columns[1] = "wallet_grey_item_buf";
    locala.uQH.put("wallet_grey_item_buf", "BLOB");
    localStringBuilder.append(" wallet_grey_item_buf BLOB");
    locala.columns[2] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(6888322236416L, 51322);
  }
  
  public aa()
  {
    GMTrace.i(6888053800960L, 51320);
    this.rRd = new arg();
    this.rRe = null;
    this.rRf = null;
    this.rRg = false;
    this.rRh = "";
    this.rRi = "";
    this.rRj = "";
    this.nwU = "";
    this.rRk = "";
    if (this.rRe == null) {
      this.rRe = new bor();
    }
    if (this.rRf == null) {
      this.rRf = new bou();
    }
    GMTrace.o(6888053800960L, 51320);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6888188018688L, 51321);
    super.b(paramCursor);
    this.rRd = new arg();
    try
    {
      this.rRd = ((arg)this.rRd.aC(this.field_wallet_grey_item_buf));
      this.rRe = this.rRd.unk;
      this.rRf = this.rRd.unl;
      this.rRg = this.rRd.unm;
      this.rRk = "";
      paramCursor = this.rRd.unn.iterator();
      for (;;)
      {
        if (paramCursor.hasNext())
        {
          String str = (String)paramCursor.next();
          this.rRk = (this.rRk + str + "\n");
          continue;
          if (this.rRe != null) {
            break;
          }
        }
      }
    }
    catch (Exception paramCursor)
    {
      w.e("WalletRegionGreyItem", "parser PayIBGGetOverseaWalletRsp error");
    }
    for (;;)
    {
      this.rRe = new bor();
      if (this.rRf == null) {
        this.rRf = new bou();
      }
      GMTrace.o(6888188018688L, 51321);
      return;
      if (this.rRd.uni != null)
      {
        this.rRh = n.a(this.rRd.uni.uEX);
        this.rRi = n.a(this.rRd.uni.uEY);
      }
      if (this.rRd.unj != null)
      {
        this.rRj = n.a(this.rRd.unj.uEV);
        this.nwU = n.a(this.rRd.unj.uEW);
      }
      w.v("WalletRegionGreyItem", "noticeContent %s", new Object[] { this.rRj });
    }
  }
  
  protected final c.a uC()
  {
    GMTrace.i(6887919583232L, 51319);
    c.a locala = gLR;
    GMTrace.o(6887919583232L, 51319);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */