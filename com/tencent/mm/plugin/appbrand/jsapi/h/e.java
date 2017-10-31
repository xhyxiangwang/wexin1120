package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.d.2;
import com.tencent.mm.plugin.appbrand.widget.picker.d.a;
import com.tencent.mm.plugin.appbrand.widget.picker.f;
import com.tencent.mm.plugin.appbrand.widget.picker.g.a;
import com.tencent.mm.plugin.appbrand.widget.picker.g.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 257;
  private static final String NAME = "showMultiPickerView";
  
  public e()
  {
    GMTrace.i(17391664758784L, 129578);
    GMTrace.o(17391664758784L, 129578);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17391798976512L, 129579);
    new b().a(this, paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(17391798976512L, 129579);
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 259;
    private static final String NAME = "onMultiPickerViewChange";
    
    public a()
    {
      GMTrace.i(17687346413568L, 131781);
      GMTrace.o(17687346413568L, 131781);
    }
  }
  
  private final class b
    extends c
    implements Runnable
  {
    private final AtomicReference<d.a[]> jaf;
    
    public b()
    {
      GMTrace.i(17393275371520L, 129590);
      this.jaf = new AtomicReference();
      GMTrace.o(17393275371520L, 129590);
    }
    
    final void l(JSONObject paramJSONObject)
    {
      GMTrace.i(17393409589248L, 129591);
      JSONArray localJSONArray1 = paramJSONObject.optJSONArray("array");
      paramJSONObject = paramJSONObject.optJSONArray("current");
      if ((localJSONArray1 == null) || (paramJSONObject == null) || (localJSONArray1.length() != paramJSONObject.length()))
      {
        e("fail:invalid data", null);
        GMTrace.o(17393409589248L, 129591);
        return;
      }
      if (localJSONArray1.length() <= 0)
      {
        e("fail empty range", null);
        GMTrace.o(17393409589248L, 129591);
        return;
      }
      d.a[] arrayOfa;
      int j;
      int i;
      int k;
      try
      {
        arrayOfa = new d.a[localJSONArray1.length()];
        j = 1;
        i = 0;
        if (i < localJSONArray1.length())
        {
          JSONArray localJSONArray2 = localJSONArray1.getJSONArray(i);
          int m = paramJSONObject.getInt(i);
          String[] arrayOfString = new String[localJSONArray2.length()];
          k = 0;
          while (k < arrayOfString.length)
          {
            arrayOfString[k] = localJSONArray2.getString(k);
            k += 1;
          }
          arrayOfa[i] = new d.a(arrayOfString, m);
          if (localJSONArray2.length() > 0) {
            break label276;
          }
          k = 1;
          break label264;
        }
        if (j != 0)
        {
          e("fail empty range", null);
          GMTrace.o(17393409589248L, 129591);
          return;
        }
      }
      catch (Exception paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.JsApiShowMultiPickerView", paramJSONObject, "opt params", new Object[0]);
        e("fail:invalid data", null);
        GMTrace.o(17393409589248L, 129591);
        return;
      }
      this.jaf.set(arrayOfa);
      com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(this);
      GMTrace.o(17393409589248L, 129591);
      return;
      for (;;)
      {
        label264:
        j &= k;
        i += 1;
        break;
        label276:
        k = 0;
      }
    }
    
    public final void run()
    {
      GMTrace.i(17393543806976L, 129592);
      com.tencent.mm.plugin.appbrand.widget.picker.d locald = (com.tencent.mm.plugin.appbrand.widget.picker.d)q(com.tencent.mm.plugin.appbrand.widget.picker.d.class);
      if (locald == null)
      {
        e("fail cant init view", null);
        GMTrace.o(17393543806976L, 129592);
        return;
      }
      d.a[] arrayOfa = (d.a[])this.jaf.get();
      if ((arrayOfa == null) || (arrayOfa.length <= 0))
      {
        e("fail error data", null);
        GMTrace.o(17393543806976L, 129592);
        return;
      }
      if ((arrayOfa == null) || (arrayOfa.length <= 0)) {}
      for (;;)
      {
        this.jHf.jHF = new g.a() {};
        this.jHf.jHH = new g.b() {};
        this.jHf.show();
        GMTrace.o(17393543806976L, 129592);
        return;
        int i = locald.adi();
        locald.S(true);
        Object localObject;
        if (i < arrayOfa.length)
        {
          i = arrayOfa.length - i;
          if (i > 0) {
            if (i > 0)
            {
              localObject = new d.2(locald, locald.getContext());
              ((YANumberPicker)localObject).jIN = locald.jHu;
              int j = 0;
              label190:
              if (j < 3) {
                if (!new String[] { "end", "middle", "start" }[j].equals("end")) {}
              }
              for (((YANumberPicker)localObject).jIr = "end";; ((YANumberPicker)localObject).jIr = "end")
              {
                ((f)localObject).setDividerHeight(com.tencent.mm.bq.a.fromDPToPix(locald.getContext(), 1));
                ((f)localObject).setTag(p.f.itn, Integer.valueOf(locald.jHs.getChildCount()));
                locald.jHs.addView((View)localObject, new LinearLayout.LayoutParams(0, -1, 1.0F));
                i -= 1;
                break;
                j += 1;
                break label190;
              }
            }
          }
        }
        else if (i > arrayOfa.length)
        {
          locald.kg(i - arrayOfa.length);
        }
        i = 0;
        while (i < arrayOfa.length)
        {
          localObject = locald.kf(i);
          d.a locala = arrayOfa[i];
          ((f)localObject).h(locala.jHw);
          ((f)localObject).setValue(locala.jHx);
          ((YANumberPicker)localObject).jIN = locald.jHu;
          i += 1;
        }
        locald.jHs.setWeightSum(locald.adi());
        locald.S(false);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */