package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{
  public long mHU;
  public long mHV;
  public long mStartTime;
  long sxd;
  public Bundle sxe;
  public a sxf;
  
  public c()
  {
    GMTrace.i(19385200672768L, 144431);
    this.sxd = 0L;
    this.mHU = 0L;
    this.mStartTime = 0L;
    this.mHV = 0L;
    this.sxf = new a();
    GMTrace.o(19385200672768L, 144431);
  }
  
  public static void W(Bundle paramBundle)
  {
    GMTrace.i(19385334890496L, 144432);
    if (paramBundle == null)
    {
      GMTrace.o(19385334890496L, 144432);
      return;
    }
    Object localObject = paramBundle.keySet();
    if (localObject == null)
    {
      GMTrace.o(19385334890496L, 144432);
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        localJSONObject.put(str, paramBundle.get(str));
      }
      paramBundle = new gj();
    }
    catch (JSONException paramBundle)
    {
      GMTrace.o(19385334890496L, 144432);
      return;
    }
    paramBundle.fCy.nN = 4;
    paramBundle.fCy.fCA = localJSONObject.toString();
    a.uLm.m(paramBundle);
    GMTrace.o(19385334890496L, 144432);
  }
  
  String Ly(String paramString)
  {
    GMTrace.i(19385603325952L, 144434);
    Matcher localMatcher = Pattern.compile("\\(.*?\\)").matcher(paramString);
    while (localMatcher.find()) {
      try
      {
        String str2 = bg.mY(localMatcher.group());
        String str1 = str2.replace("(", "").replace(")", "").replace(" ", "");
        String[] arrayOfString;
        if (str1.contains("__ALLSTAYTIME__"))
        {
          str1 = str1.replace("__ALLSTAYTIME__", String.valueOf(this.sxd / 1000L));
          arrayOfString = str1.split("\\+");
          if (arrayOfString.length == 2) {
            str1 = String.valueOf(Long.parseLong(arrayOfString[0]) + Long.parseLong(arrayOfString[1]));
          }
          paramString = paramString.replace(str2, str1);
        }
        else if (str2.contains("__FOREGROUNDTIME__"))
        {
          str1 = str1.replace("__FOREGROUNDTIME__", String.valueOf(this.mHU / 1000L));
          arrayOfString = str1.split("\\+");
          if (arrayOfString.length == 2) {
            str1 = String.valueOf(Long.parseLong(arrayOfString[0]) + Long.parseLong(arrayOfString[1]));
          }
          paramString = paramString.replace(str2, str1);
        }
      }
      catch (NumberFormatException paramString)
      {
        w.i("MicroMsg.GamePageTimeReport", "matchTimeMark, err:%s", new Object[] { paramString.getMessage() });
        GMTrace.o(19385603325952L, 144434);
        return null;
      }
    }
    GMTrace.o(19385603325952L, 144434);
    return paramString;
  }
  
  public void y(Bundle paramBundle)
  {
    GMTrace.i(19385469108224L, 144433);
    GMTrace.o(19385469108224L, 144433);
  }
  
  public final class a
  {
    public a()
    {
      GMTrace.i(19391374688256L, 144477);
      GMTrace.o(19391374688256L, 144477);
    }
    
    public final void X(Bundle paramBundle)
    {
      GMTrace.i(19391777341440L, 144480);
      c.this.sxe = paramBundle;
      w.i("MicroMsg.GamePageTimeReport", "setGamePageReportData");
      if ((paramBundle != null) && (paramBundle.getBoolean("game_page_report_time_begin")))
      {
        c.this.mHU = 0L;
        c.this.mStartTime = System.currentTimeMillis();
        c.this.mHV = System.currentTimeMillis();
      }
      GMTrace.o(19391777341440L, 144480);
    }
    
    public final void bCS()
    {
      GMTrace.i(19391508905984L, 144478);
      c.this.sxe = null;
      c.this.mStartTime = 0L;
      c.this.mHU = 0L;
      c.this.mStartTime = 0L;
      c.this.mHV = 0L;
      GMTrace.o(19391508905984L, 144478);
    }
    
    public final void bCT()
    {
      GMTrace.i(19391643123712L, 144479);
      c.this.mStartTime = System.currentTimeMillis();
      c.this.mHV = System.currentTimeMillis();
      GMTrace.o(19391643123712L, 144479);
    }
    
    public final void onDestroy()
    {
      GMTrace.i(19392179994624L, 144483);
      c localc = c.this;
      String str1;
      String str2;
      if (localc.mStartTime != 0L)
      {
        localc.sxd = (System.currentTimeMillis() - localc.mStartTime);
        w.i("MicroMsg.GamePageTimeReport", "visit page(%s), stayTime:%sms, foregroundTime:%sms", new Object[] { Integer.valueOf(localc.hashCode()), Long.valueOf(localc.sxd), Long.valueOf(localc.mHU) });
        if (localc.sxe == null)
        {
          w.i("MicroMsg.GamePageTimeReport", "report game page time fail. ReportData is null");
          GMTrace.o(19392179994624L, 144483);
          return;
        }
        str1 = localc.sxe.getString("game_page_report_format_data");
        str2 = localc.sxe.getString("game_page_report_tabs_format_data");
        if (bg.mZ(str1)) {
          break label221;
        }
        str1 = str1.replace("__ALLSTAYTIME__", String.valueOf(localc.sxd / 1000L)).replace("__FOREGROUNDTIME__", String.valueOf(localc.mHU / 1000L));
        localc.sxe.putString("game_page_report_format_data", str1);
        w.i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportFormatData:%s", new Object[] { Integer.valueOf(localc.hashCode()), str1 });
        if (!ab.bNe()) {
          break label288;
        }
        c.W(localc.sxe);
      }
      for (;;)
      {
        localc.sxe = null;
        label221:
        do
        {
          GMTrace.o(19392179994624L, 144483);
          return;
          if (bg.mZ(str2)) {
            break;
          }
          str1 = localc.Ly(str2);
        } while (bg.mZ(str1));
        localc.sxe.putString("game_page_report_tabs_format_data", str1);
        w.i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportTabsFormatdata:%s", new Object[] { Integer.valueOf(localc.hashCode()), str1 });
        break;
        GMTrace.o(19392179994624L, 144483);
        return;
        label288:
        localc.y(localc.sxe);
      }
    }
    
    public final void onPause()
    {
      GMTrace.i(19392045776896L, 144482);
      if (c.this.mHV != 0L) {
        c.this.mHU += System.currentTimeMillis() - c.this.mHV;
      }
      GMTrace.o(19392045776896L, 144482);
    }
    
    public final void onResume()
    {
      GMTrace.i(19391911559168L, 144481);
      if (c.this.mHV != 0L) {
        c.this.mHV = System.currentTimeMillis();
      }
      GMTrace.o(19391911559168L, 144481);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */