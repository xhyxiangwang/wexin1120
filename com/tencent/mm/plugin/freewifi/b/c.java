package com.tencent.mm.plugin.freewifi.b;

import android.database.MatrixCursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.eu;
import com.tencent.mm.g.a.eu.a;
import com.tencent.mm.plugin.freewifi.d.j;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.amd;
import com.tencent.mm.protocal.c.ame;
import com.tencent.mm.protocal.c.amf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  public static final String[] mde;
  private static final String[] mdf;
  private int mdg;
  private int mdh;
  private long mdi;
  
  static
  {
    GMTrace.i(7126290268160L, 53095);
    mde = new String[] { "ssid", "bssid", "rssi", "isWechatWifi", "wechatShopName", "maxApCount", "intervalSeconds" };
    mdf = new String[] { "errcode", "errmsg", "maxApCount", "intervalSeconds" };
    GMTrace.o(7126290268160L, 53095);
  }
  
  public c()
  {
    GMTrace.i(7124411219968L, 53081);
    this.mdg = 200;
    this.mdh = 180;
    this.mdi = 0L;
    GMTrace.o(7124411219968L, 53081);
  }
  
  public static void a(eu parameu, MatrixCursor paramMatrixCursor)
  {
    GMTrace.i(16034723528704L, 119468);
    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "FreeWifiManufacturerGetWifiListHelper setResult. errorcode=%d, errmsg=%s", new Object[] { Integer.valueOf(1), null });
    parameu.fzQ.fzS = paramMatrixCursor;
    parameu.fzQ.fzw = 1;
    if (parameu.fwM != null) {
      parameu.fwM.run();
    }
    GMTrace.o(16034723528704L, 119468);
  }
  
  public static c azL()
  {
    GMTrace.i(7124545437696L, 53082);
    c localc = a.mdn;
    GMTrace.o(7124545437696L, 53082);
    return localc;
  }
  
  private long azO()
  {
    try
    {
      GMTrace.i(7125484961792L, 53089);
      long l = this.mdi;
      GMTrace.o(7125484961792L, 53089);
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(final eu parameu)
  {
    int j = 0;
    for (;;)
    {
      Object localObject;
      try
      {
        GMTrace.i(7124679655424L, 53083);
        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "method getWifiList called. reqMaxApCount=" + azM() + "; reqIntervalSeconds=" + azN());
        localObject = parameu.fzP.fzR;
        if ((localObject != null) && (localObject.length != 0)) {
          continue;
        }
        a(parameu, 1101, "Args is empty.");
        GMTrace.o(7124679655424L, 53083);
      }
      finally
      {
        try
        {
          StringBuilder localStringBuilder;
          i = Integer.valueOf(localObject[0]).intValue();
          if (i != 1) {
            break label738;
          }
          if (localObject.length == 3) {
            break label266;
          }
          a(parameu, 1104, "Args.length should be 3, but now it is " + localObject.length + ".");
          GMTrace.o(7124679655424L, 53083);
        }
        catch (Exception localException1)
        {
          a(parameu, 1102, "Args[0] is not an integer.");
          GMTrace.o(7124679655424L, 53083);
        }
        parameu = finally;
      }
      return;
      localStringBuilder = new StringBuilder();
      int i = 0;
      if (i < localObject.length)
      {
        localStringBuilder.append("args[" + i + "] = " + localObject[i]);
        i += 1;
      }
      else
      {
        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "args: " + localStringBuilder.toString());
        continue;
        label266:
        final int k;
        try
        {
          k = Integer.valueOf(localObject[2]).intValue();
          if ((k == 1) || (k == 2)) {
            break label334;
          }
          a(parameu, 1106, "Args[2] should be integer 1 (from setting) or integer 2 (from background).");
          GMTrace.o(7124679655424L, 53083);
        }
        catch (Exception localException2)
        {
          a(parameu, 1107, "Args[2] is not a valid int value.");
          GMTrace.o(7124679655424L, 53083);
        }
        continue;
        label334:
        if ((azO() != 0L) && (System.currentTimeMillis() - azO() < azN()) && (k == 2))
        {
          a(parameu, 1109, "Request frequence is out of limit. The time btween two background request should be more than  " + this.mdh + " seconds.");
          GMTrace.o(7124679655424L, 53083);
        }
        else if (m.xJ(localObject[1]))
        {
          a(parameu, 1105, "Args[1] should be an ap list json string, but now it is empty.");
          GMTrace.o(7124679655424L, 53083);
        }
        else
        {
          LinkedList localLinkedList = new LinkedList();
          try
          {
            localObject = new JSONArray(localObject[1]);
            if (((JSONArray)localObject).length() > azM())
            {
              a(parameu, 1110, "jsonArray.length()=" + ((JSONArray)localObject).length() + ". Too many ap. The number of ap requested per time should be between 1 and " + azM() + ".");
              GMTrace.o(7124679655424L, 53083);
              continue;
            }
            i = j;
            if (((JSONArray)localObject).length() == 0)
            {
              a(parameu, 1110, "jsonArray.length()=" + ((JSONArray)localObject).length() + ". Too many ap. The number of ap requested per time should be between 1 and " + azM() + ".");
              GMTrace.o(7124679655424L, 53083);
              continue;
            }
            while (i < ((JSONArray)localObject).length())
            {
              JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
              ame localame = new ame();
              localame.ssid = m.xK(localJSONObject.getString("ssid"));
              localame.bssid = localJSONObject.getString("bssid");
              localame.fzv = localJSONObject.getInt("rssi");
              localLinkedList.add(localame);
              i += 1;
            }
          }
          catch (Exception localException3)
          {
            a(parameu, 1105, "Args[1] is not a valid json array value and it should be a string like  [  {    \"ssid\": \"SSID_NAME\",    \"bssid\": \"0e:00:00:00:00:00\",    \"rssi\": -45  }].");
            GMTrace.o(7124679655424L, 53083);
          }
          new j(localException3, k).b(new e()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
            {
              GMTrace.i(7121458429952L, 53059);
              synchronized (c.this)
              {
                paramAnonymousk = ((j)paramAnonymousk).aAy();
                c.this.cv(System.currentTimeMillis());
                localObject1 = c.this;
                int i;
                if (paramAnonymousk.mdh <= 0) {
                  i = 180;
                }
                for (;;)
                {
                  ((c)localObject1).nH(i);
                  w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "resp.reqMaxApCount=" + paramAnonymousk.mdg);
                  if (paramAnonymousk.mdg <= 0)
                  {
                    i = 200;
                    label101:
                    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "_reqMaxApCount = " + i);
                    c.this.nG(i);
                    if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
                      break label1034;
                    }
                    paramAnonymousString = paramAnonymousk.ugY;
                    localObject1 = null;
                  }
                  for (;;)
                  {
                    try
                    {
                      paramAnonymousk = new MatrixCursor(c.mde);
                    }
                    catch (Exception paramAnonymousString)
                    {
                      amf localamf;
                      Object localObject2;
                      paramAnonymousk = (k)localObject1;
                      continue;
                      paramAnonymousInt1 += 1;
                      continue;
                    }
                    try
                    {
                      localObject1 = new HashMap();
                      paramAnonymousInt1 = 0;
                      if (paramAnonymousInt1 < paramAnonymousString.size())
                      {
                        localamf = (amf)paramAnonymousString.get(paramAnonymousInt1);
                        ((Map)localObject1).put(localamf.ssid + "-" + localamf.bssid, Integer.valueOf(paramAnonymousInt1));
                        paramAnonymousInt1 += 1;
                        continue;
                        i = paramAnonymousk.mdh;
                        break;
                        i = paramAnonymousk.mdg;
                        break label101;
                      }
                      paramAnonymousInt1 = 0;
                      if (paramAnonymousInt1 >= localException3.size()) {
                        continue;
                      }
                      localObject2 = (ame)localException3.get(paramAnonymousInt1);
                      localamf = new amf();
                      localamf.ssid = ((ame)localObject2).ssid;
                      localamf.bssid = ((ame)localObject2).bssid;
                      localamf.fzv = ((ame)localObject2).fzv;
                      localamf.ugZ = 0;
                      localamf.uha = null;
                      localamf.mbY = 0;
                      localamf.fvF = null;
                      if (((Map)localObject1).get(localamf.ssid + "-" + localamf.bssid) != null)
                      {
                        localObject2 = (Integer)((Map)localObject1).get(localamf.ssid + "-" + localamf.bssid);
                        if (paramAnonymousString.get(((Integer)localObject2).intValue()) != null)
                        {
                          localamf.ugZ = ((amf)paramAnonymousString.get(((Integer)localObject2).intValue())).ugZ;
                          localamf.uha = ((amf)paramAnonymousString.get(((Integer)localObject2).intValue())).uha;
                          localamf.mbY = ((amf)paramAnonymousString.get(((Integer)localObject2).intValue())).mbY;
                          localamf.fvF = ((amf)paramAnonymousString.get(((Integer)localObject2).intValue())).fvF;
                        }
                      }
                      if ((localamf.mbY != 4) && (localamf.mbY != 31))
                      {
                        paramAnonymousk.addRow(new Object[] { localamf.ssid, localamf.bssid, Integer.valueOf(localamf.fzv), Integer.valueOf(0), null, Integer.valueOf(c.this.azM()), Integer.valueOf(c.this.azN()) });
                        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cursor add row. ssid=%s, bssid=%s, rssi=%d, isWechatwifi=%d, wechatShopName=%s, maxApCount=%d, reqIntervalSeconds=%d", new Object[] { localamf.ssid, localamf.bssid, Integer.valueOf(localamf.fzv), Integer.valueOf(0), null, Integer.valueOf(c.this.azM()), Integer.valueOf(c.this.azN()) });
                      }
                      else
                      {
                        paramAnonymousk.addRow(new Object[] { localamf.ssid, localamf.bssid, Integer.valueOf(localamf.fzv), Integer.valueOf(localamf.ugZ), localamf.uha, Integer.valueOf(c.this.azM()), Integer.valueOf(c.this.azN()) });
                        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cursor add row. ssid=%s, bssid=%s, rssi=%d, isWechatwifi=%d, wechatShopName=%s, maxApCount=%d, reqIntervalSeconds=%d", new Object[] { localamf.ssid, localamf.bssid, Integer.valueOf(localamf.fzv), Integer.valueOf(localamf.ugZ), localamf.uha, Integer.valueOf(c.this.azM()), Integer.valueOf(c.this.azN()) });
                        if ((localamf.ugZ == 1) && (k == 1))
                        {
                          a.a.mcZ.c(localamf.ssid, localamf.bssid, localamf.fvF, localamf.mbY);
                          w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cached : ssid=%s, bssid=%s, apKey=%s, protocolType=%d. ", new Object[] { localamf.ssid, localamf.bssid, localamf.fvF, Integer.valueOf(localamf.mbY) });
                        }
                      }
                    }
                    catch (Exception paramAnonymousString) {}
                  }
                }
                if (paramAnonymousk != null) {
                  paramAnonymousk.close();
                }
                w.e("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "exception in getWifiList syncTaskCur.", new Object[] { paramAnonymousString });
                c.this.a(parameu, 1108, "cursor exception.");
                GMTrace.o(7121458429952L, 53059);
                return;
                c.a(parameu, paramAnonymousk);
                GMTrace.o(7121458429952L, 53059);
                return;
                label1034:
                if (paramAnonymousInt2 == 35501)
                {
                  c.this.a(parameu, 1110, "Too many ap. The number of ap requested per time should be between 1 and " + c.this.azM() + ".");
                  GMTrace.o(7121458429952L, 53059);
                  return;
                }
                c.this.a(parameu, 1121, "Server returns errtype= " + paramAnonymousInt1 + ", errcode=" + paramAnonymousInt2 + ", errMsg=" + m.xL(paramAnonymousString) + ".");
                GMTrace.o(7121458429952L, 53059);
                return;
              }
            }
          });
          GMTrace.o(7124679655424L, 53083);
          continue;
          label738:
          a(parameu, 1103, "Wechant installed currently only supports version 1.");
          GMTrace.o(7124679655424L, 53083);
        }
      }
    }
  }
  
  public final void a(eu parameu, int paramInt, String paramString)
  {
    GMTrace.i(7124813873152L, 53084);
    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "FreeWifiManufacturerGetWifiListHelper setErrorResult. errorcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    try
    {
      localMatrixCursor = new MatrixCursor(mdf);
      if (localMatrixCursor == null) {
        break label141;
      }
    }
    catch (Exception paramString)
    {
      try
      {
        localMatrixCursor.addRow(new Object[] { Integer.valueOf(paramInt), paramString, Integer.valueOf(azM()), Integer.valueOf(azN()) });
        parameu.fzQ.fzS = localMatrixCursor;
        parameu.fzQ.fzw = 1;
        if (parameu.fwM != null) {
          parameu.fwM.run();
        }
        GMTrace.o(7124813873152L, 53084);
        return;
      }
      catch (Exception paramString)
      {
        MatrixCursor localMatrixCursor;
        for (;;) {}
      }
      paramString = paramString;
      localMatrixCursor = null;
    }
    localMatrixCursor.close();
    label141:
    w.e("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "exception in getWifiList syncTaskCur.", new Object[] { paramString });
    parameu.fzQ.fzS = null;
    parameu.fzQ.fzw = 1;
    if (parameu.fwM != null) {
      parameu.fwM.run();
    }
    GMTrace.o(7124813873152L, 53084);
  }
  
  public final int azM()
  {
    try
    {
      GMTrace.i(7124948090880L, 53085);
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "getReqMaxApCount() returns " + this.mdg);
      int i = this.mdg;
      GMTrace.o(7124948090880L, 53085);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int azN()
  {
    try
    {
      GMTrace.i(7125216526336L, 53087);
      int i = this.mdh;
      GMTrace.o(7125216526336L, 53087);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void cv(long paramLong)
  {
    try
    {
      GMTrace.i(7125619179520L, 53090);
      this.mdi = paramLong;
      GMTrace.o(7125619179520L, 53090);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void nG(int paramInt)
  {
    try
    {
      GMTrace.i(7125082308608L, 53086);
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "setReqMaxApCount() param reqMaxApCount = " + paramInt);
      this.mdg = paramInt;
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "setReqMaxApCount() this.reqMaxApCount = " + this.mdg);
      GMTrace.o(7125082308608L, 53086);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void nH(int paramInt)
  {
    try
    {
      GMTrace.i(7125350744064L, 53088);
      this.mdh = paramInt;
      GMTrace.o(7125350744064L, 53088);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static final class a
  {
    public static c mdn;
    
    static
    {
      GMTrace.i(7123740131328L, 53076);
      mdn = new c();
      GMTrace.o(7123740131328L, 53076);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */