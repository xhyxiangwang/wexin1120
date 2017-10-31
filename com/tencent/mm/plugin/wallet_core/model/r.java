package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dn;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.a;
import com.tencent.mm.plugin.wallet_core.model.mall.b;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

public final class r
  extends dn
{
  public static c.a gLR;
  public ArrayList<MallFunction> nEA;
  private ArrayList<MallNews> nEB;
  private ArrayList<a> nEC;
  public SparseArray<String> nED;
  
  static
  {
    GMTrace.i(6870068625408L, 51186);
    c.a locala = new c.a();
    locala.hRR = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_region";
    locala.uQH.put("wallet_region", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" wallet_region INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "wallet_region";
    locala.columns[1] = "function_list";
    locala.uQH.put("function_list", "TEXT");
    localStringBuilder.append(" function_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "new_list";
    locala.uQH.put("new_list", "TEXT");
    localStringBuilder.append(" new_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "banner_list";
    locala.uQH.put("banner_list", "TEXT");
    localStringBuilder.append(" banner_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "type_name_list";
    locala.uQH.put("type_name_list", "TEXT");
    localStringBuilder.append(" type_name_list TEXT");
    locala.columns[5] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(6870068625408L, 51186);
  }
  
  public r()
  {
    GMTrace.i(6869665972224L, 51183);
    this.nEA = new ArrayList();
    this.nEB = new ArrayList();
    this.nEC = new ArrayList();
    this.nED = new SparseArray();
    GMTrace.o(6869665972224L, 51183);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6869934407680L, 51185);
    super.b(paramCursor);
    String str3 = this.field_function_list;
    String str2 = this.field_new_list;
    String str1 = this.field_banner_list;
    paramCursor = this.field_type_name_list;
    try
    {
      if (!bg.mZ(str3)) {
        this.nEA = b.y(new JSONArray(str3));
      }
    }
    catch (Exception localException2)
    {
      try
      {
        if (!bg.mZ(str2)) {
          this.nEB = b.v(new JSONArray(str2));
        }
      }
      catch (Exception localException2)
      {
        try
        {
          for (;;)
          {
            if (!bg.mZ(str1)) {
              this.nEC = b.w(new JSONArray(str1));
            }
            try
            {
              if (!bg.mZ(paramCursor)) {
                this.nED = b.x(new JSONArray(paramCursor));
              }
              GMTrace.o(6869934407680L, 51185);
              return;
            }
            catch (Exception paramCursor)
            {
              this.nED = null;
              w.printErrStackTrace("MicroMsg.WalletFunciontListInfo", paramCursor, "", new Object[0]);
              GMTrace.o(6869934407680L, 51185);
            }
            localException3 = localException3;
            w.printErrStackTrace("MicroMsg.WalletFunciontListInfo", localException3, "", new Object[0]);
            continue;
            localException2 = localException2;
            this.nEB = null;
            w.printErrStackTrace("MicroMsg.WalletFunciontListInfo", localException2, "", new Object[0]);
          }
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            this.nEC = null;
            w.printErrStackTrace("MicroMsg.WalletFunciontListInfo", localException1, "", new Object[0]);
          }
        }
      }
    }
  }
  
  protected final c.a uC()
  {
    GMTrace.i(6869800189952L, 51184);
    c.a locala = gLR;
    GMTrace.o(6869800189952L, 51184);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */