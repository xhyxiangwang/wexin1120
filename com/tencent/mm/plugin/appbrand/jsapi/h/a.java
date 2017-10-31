package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.g.a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

final class a
  extends c
{
  volatile a iZQ;
  volatile Long iZR;
  volatile Long iZS;
  volatile int iZT;
  volatile int iZU;
  volatile int iZV;
  
  a()
  {
    GMTrace.i(10379459559424L, 77333);
    this.iZR = null;
    this.iZS = null;
    this.iZT = -1;
    this.iZU = -1;
    this.iZV = -1;
    GMTrace.o(10379459559424L, 77333);
  }
  
  final void l(JSONObject paramJSONObject)
  {
    GMTrace.i(10379593777152L, 77334);
    this.iZQ = a.qu(paramJSONObject.optString("fields"));
    Object localObject2 = paramJSONObject.optJSONObject("range");
    if (localObject2 != null)
    {
      localObject1 = ((JSONObject)localObject2).optString("start", "");
      localObject1 = this.iZQ.parse((String)localObject1);
      localObject2 = ((JSONObject)localObject2).optString("end", "");
      localObject2 = this.iZQ.parse((String)localObject2);
      if (localObject1 != null) {
        this.iZR = Long.valueOf(((Date)localObject1).getTime());
      }
      if (localObject2 != null) {
        this.iZS = Long.valueOf(((Date)localObject2).getTime());
      }
    }
    paramJSONObject = paramJSONObject.optString("current", "");
    Object localObject1 = this.iZQ.parse(paramJSONObject);
    paramJSONObject = (JSONObject)localObject1;
    if (localObject1 == null) {
      paramJSONObject = new Date(System.currentTimeMillis());
    }
    this.iZT = (paramJSONObject.getYear() + 1900);
    this.iZU = (paramJSONObject.getMonth() + 1);
    this.iZV = paramJSONObject.getDate();
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        boolean bool3 = true;
        int j = 0;
        GMTrace.i(10380130648064L, 77338);
        Object localObject2 = a.this;
        Object localObject1 = (com.tencent.mm.plugin.appbrand.widget.picker.c)((a)localObject2).q(com.tencent.mm.plugin.appbrand.widget.picker.c.class);
        if (localObject1 == null)
        {
          ((c)localObject2).e("fail cant init view", null);
          GMTrace.o(10380130648064L, 77338);
          return;
        }
        com.tencent.mm.plugin.appbrand.widget.picker.a locala = ((b)localObject2).jHf;
        locala.jHF = new a.2((a)localObject2);
        ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).a(((a)localObject2).iZT, ((a)localObject2).iZU, ((a)localObject2).iZV, null);
        if (((a)localObject2).iZR != null) {
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).setMinDate(((a)localObject2).iZR.longValue());
        }
        if (((a)localObject2).iZS != null) {
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).setMaxDate(((a)localObject2).iZS.longValue());
        }
        boolean bool1;
        boolean bool2;
        if (((a)localObject2).iZQ.ordinal() >= a.a.iZX.ordinal())
        {
          bool1 = true;
          if (((a)localObject2).iZQ.ordinal() < a.a.iZY.ordinal()) {
            break label344;
          }
          bool2 = true;
          label176:
          if (((a)localObject2).iZQ.ordinal() < a.a.iZZ.ordinal()) {
            break label350;
          }
          label193:
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHg = bool1;
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHh = bool2;
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHi = bool3;
          if (((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHj != null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHj.setEnabled(bool1);
            localObject2 = ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHj;
            if (!bool1) {
              break label356;
            }
            i = 0;
            label243:
            ((NumberPicker)localObject2).setVisibility(i);
          }
          if (((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHk != null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHk.setEnabled(bool2);
            localObject2 = ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHk;
            if (!bool2) {
              break label362;
            }
            i = 0;
            label281:
            ((NumberPicker)localObject2).setVisibility(i);
          }
          if (((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHl != null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHl.setEnabled(bool3);
            localObject1 = ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).jHl;
            if (!bool3) {
              break label368;
            }
          }
        }
        label344:
        label350:
        label356:
        label362:
        label368:
        for (int i = j;; i = 8)
        {
          ((NumberPicker)localObject1).setVisibility(i);
          locala.show();
          GMTrace.o(10380130648064L, 77338);
          return;
          bool1 = false;
          break;
          bool2 = false;
          break label176;
          bool3 = false;
          break label193;
          i = 8;
          break label243;
          i = 8;
          break label281;
        }
      }
    });
    GMTrace.o(10379593777152L, 77334);
  }
  
  private static enum a
  {
    final DateFormat jaa;
    
    static
    {
      GMTrace.i(10379325341696L, 77332);
      iZX = new a("YEAR", 0, new SimpleDateFormat("yyyy", Locale.US));
      iZY = new a("MONTH", 1, new SimpleDateFormat("yyyy-MM", Locale.US));
      iZZ = new a("DAY", 2, new SimpleDateFormat("yyyy-MM-dd", Locale.US));
      jab = new a[] { iZX, iZY, iZZ };
      GMTrace.o(10379325341696L, 77332);
    }
    
    private a(DateFormat paramDateFormat)
    {
      GMTrace.i(10378922688512L, 77329);
      this.jaa = paramDateFormat;
      GMTrace.o(10378922688512L, 77329);
    }
    
    static a qu(String paramString)
    {
      int i = 0;
      GMTrace.i(10379056906240L, 77330);
      paramString = paramString.substring(0, Math.max(0, Math.min(paramString.length(), 5))).toLowerCase();
      switch (paramString.hashCode())
      {
      default: 
        label68:
        i = -1;
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          paramString = iZY;
          GMTrace.o(10379056906240L, 77330);
          return paramString;
          if (!paramString.equals("year")) {
            break label68;
          }
          continue;
          if (!paramString.equals("month")) {
            break label68;
          }
          i = 1;
          continue;
          if (!paramString.equals("day")) {
            break label68;
          }
          i = 2;
        }
      }
      paramString = iZX;
      GMTrace.o(10379056906240L, 77330);
      return paramString;
      paramString = iZY;
      GMTrace.o(10379056906240L, 77330);
      return paramString;
      paramString = iZZ;
      GMTrace.o(10379056906240L, 77330);
      return paramString;
    }
    
    final Date parse(String paramString)
    {
      GMTrace.i(10379191123968L, 77331);
      try
      {
        paramString = this.jaa.parse(paramString);
        GMTrace.o(10379191123968L, 77331);
        return paramString;
      }
      catch (Exception paramString)
      {
        GMTrace.o(10379191123968L, 77331);
      }
      return null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */