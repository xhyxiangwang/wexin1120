package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.g.a;
import com.tencent.mm.plugin.appbrand.widget.picker.h;
import com.tencent.mm.plugin.appbrand.widget.picker.j;
import org.json.JSONObject;

final class i
  extends c
{
  int jar;
  int jas;
  int jat;
  int jau;
  int jav;
  int jaw;
  
  i()
  {
    GMTrace.i(10377580511232L, 77319);
    this.jar = -1;
    this.jas = -1;
    this.jat = -1;
    this.jau = -1;
    this.jav = -1;
    this.jaw = -1;
    GMTrace.o(10377580511232L, 77319);
  }
  
  final void l(JSONObject paramJSONObject)
  {
    GMTrace.i(10377714728960L, 77320);
    Object localObject2 = paramJSONObject.optJSONObject("range");
    if (localObject2 != null)
    {
      Object localObject1 = ((JSONObject)localObject2).optString("start");
      localObject2 = ((JSONObject)localObject2).optString("end");
      localObject1 = j.sG((String)localObject1);
      if (localObject1 != null)
      {
        this.jar = localObject1[0];
        this.jas = localObject1[1];
      }
      localObject1 = j.sG((String)localObject2);
      if (localObject1 != null)
      {
        this.jat = localObject1[0];
        this.jau = localObject1[1];
      }
    }
    paramJSONObject = j.sG(paramJSONObject.optString("current"));
    if (paramJSONObject != null)
    {
      this.jav = paramJSONObject[0];
      this.jaw = paramJSONObject[1];
    }
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10377983164416L, 77322);
        i locali = i.this;
        h localh = (h)locali.q(h.class);
        if (localh == null)
        {
          locali.e("fail cant init view", null);
          GMTrace.o(10377983164416L, 77322);
          return;
        }
        a locala = locali.jHf;
        int i = locali.jar;
        int j = locali.jas;
        localh.jar = i;
        localh.jas = j;
        if ((j.ki(localh.jar)) && (localh.jHK != null)) {
          localh.jHK.setMinValue(localh.jar);
        }
        i = locali.jat;
        j = locali.jau;
        localh.jat = i;
        localh.jau = j;
        if ((j.ki(localh.jat)) && (localh.jHK != null)) {
          localh.jHK.setMaxValue(localh.jat);
        }
        i = locali.jav;
        j = locali.jaw;
        if ((j.ki(i)) && (j.kh(j)))
        {
          localh.setCurrentHour(Integer.valueOf(i));
          localh.setCurrentMinute(Integer.valueOf(j));
        }
        localh.adl();
        locala.jHF = new i.2(locali);
        locala.show();
        GMTrace.o(10377983164416L, 77322);
      }
    });
    GMTrace.o(10377714728960L, 77320);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */