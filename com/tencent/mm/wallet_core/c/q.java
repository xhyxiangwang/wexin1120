package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q
{
  private static q xgw;
  public String TAG;
  private int xgq;
  public String xgr;
  public String xgs;
  public String xgt;
  public String xgu;
  public Vector<p> xgv;
  
  public q()
  {
    GMTrace.i(1444585406464L, 10763);
    this.TAG = "MicroMsg.WalletDigCertManager";
    this.xgq = 0;
    this.xgr = "";
    this.xgs = "";
    this.xgt = "";
    this.xgu = "";
    this.xgv = new Vector();
    GMTrace.o(1444585406464L, 10763);
  }
  
  public static void Wx(String paramString)
  {
    GMTrace.i(1444316971008L, 10761);
    ap.AS();
    c.xi().a(w.a.uZv, paramString);
    GMTrace.o(1444316971008L, 10761);
  }
  
  public static String ciQ()
  {
    GMTrace.i(1444451188736L, 10762);
    ap.AS();
    String str = (String)c.xi().get(w.a.uZv, "");
    GMTrace.o(1444451188736L, 10762);
    return str;
  }
  
  public static q ciR()
  {
    GMTrace.i(1444719624192L, 10764);
    if (xgw == null) {
      xgw = new q();
    }
    q localq = xgw;
    GMTrace.o(1444719624192L, 10764);
    return localq;
  }
  
  public final void Wy(String paramString)
  {
    GMTrace.i(1445122277376L, 10767);
    if (bg.mZ(paramString))
    {
      GMTrace.o(1445122277376L, 10767);
      return;
    }
    if (paramString.equals(ciQ()))
    {
      this.xgq = 0;
      Wx("");
      w.i(this.TAG, "clean token %s  stack %s ", new Object[] { paramString, bg.bOd().toString() });
      a.ciD();
      a.clearCert(paramString);
    }
    paramString = this.xgv.iterator();
    if (paramString.hasNext())
    {
      paramString = (p)paramString.next();
      this.xgv.remove(paramString);
      GMTrace.o(1445122277376L, 10767);
      return;
    }
    GMTrace.o(1445122277376L, 10767);
  }
  
  public final void Z(JSONObject paramJSONObject)
  {
    GMTrace.i(1444988059648L, 10766);
    Object localObject = paramJSONObject.optJSONObject("cert_info");
    if (localObject == null)
    {
      GMTrace.o(1444988059648L, 10766);
      return;
    }
    this.xgv = new Vector();
    int i = ((JSONObject)localObject).optInt("show_crt_info");
    this.xgq = ((JSONObject)localObject).optInt("is_crt_install");
    this.xgu = ((JSONObject)localObject).optString("crt_item_logo_url");
    this.xgr = ((JSONObject)localObject).optString("crt_entry_desc");
    this.xgs = ((JSONObject)localObject).optString("crt_entry_title");
    this.xgt = ((JSONObject)localObject).optString("crt_status_name");
    ap.AS();
    c.xi().a(w.a.uZw, Integer.valueOf(i));
    paramJSONObject = ciQ();
    localObject = ((JSONObject)localObject).optJSONArray("crt_list");
    if (localObject != null) {
      i = 0;
    }
    for (;;)
    {
      if (i < ((JSONArray)localObject).length())
      {
        try
        {
          p localp = new p(((JSONArray)localObject).getJSONObject(i));
          if (localp.xgp == 0) {
            break label272;
          }
          if (bg.mZ(paramJSONObject)) {
            w.i(this.TAG, "drop crt list no exist local drop: %s", new Object[] { localp.uyo });
          } else if (localp.uyo.equals(paramJSONObject)) {
            this.xgv.add(localp);
          }
        }
        catch (Exception localException)
        {
          w.i(this.TAG, "WalletDigCertManager error %s", new Object[] { localException.getMessage() });
        }
        w.i(this.TAG, "drop crt list %s drop: %s", new Object[] { paramJSONObject, localException.uyo });
        break label295;
        label272:
        this.xgv.add(localException);
      }
      else
      {
        GMTrace.o(1444988059648L, 10766);
        return;
      }
      label295:
      i += 1;
    }
  }
  
  public final boolean ciS()
  {
    GMTrace.i(1444853841920L, 10765);
    if (!bg.mZ(ciQ()))
    {
      if (this.xgq > 0)
      {
        GMTrace.o(1444853841920L, 10765);
        return true;
      }
      GMTrace.o(1444853841920L, 10765);
      return false;
    }
    GMTrace.o(1444853841920L, 10765);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */