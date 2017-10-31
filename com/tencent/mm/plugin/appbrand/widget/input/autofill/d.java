package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.EditText;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.e.e.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.x;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public final class d
{
  public static <Input extends EditText,  extends x> void a(final AppBrandPageView paramAppBrandPageView, Input paramInput, a.a parama)
  {
    GMTrace.i(18258174410752L, 136034);
    if (!((x)paramInput).acj())
    {
      GMTrace.o(18258174410752L, 136034);
      return;
    }
    paramAppBrandPageView = new WeakReference(paramAppBrandPageView);
    paramAppBrandPageView = new h()
    {
      public final void a(String paramAnonymousString, h.a paramAnonymousa)
      {
        GMTrace.i(18261932507136L, 136062);
        Object localObject = (EditText)this.jEK.get();
        AppBrandPageView localAppBrandPageView = (AppBrandPageView)paramAppBrandPageView.get();
        if ((localObject == null) || (localAppBrandPageView == null))
        {
          GMTrace.o(18261932507136L, 136062);
          return;
        }
        localObject = ((x)localObject).abA();
        if (bg.mZ((String)localObject))
        {
          GMTrace.o(18261932507136L, 136062);
          return;
        }
        e.a locala = new e.a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("id", paramAnonymousString);
        localHashMap.put("type", paramAnonymousa.name().toLowerCase());
        localHashMap.put("inputId", localObject);
        locala.aj(localAppBrandPageView.iqL, localAppBrandPageView.hashCode()).r(localHashMap).f(new int[] { localAppBrandPageView.hashCode() });
        GMTrace.o(18261932507136L, 136062);
      }
    };
    paramInput = ((x)paramInput).acy();
    Object localObject = parama.jFH;
    paramInput.jEx = new a(paramInput.jEr.getContext(), (List)localObject);
    paramInput.jEx.jEk = paramInput.jEv;
    localObject = paramInput.jEs;
    a locala = paramInput.jEx;
    if (((AutoFillListPopupWindowBase)localObject).mObserver == null)
    {
      ((AutoFillListPopupWindowBase)localObject).mObserver = new AutoFillListPopupWindowBase.c((AutoFillListPopupWindowBase)localObject, (byte)0);
      ((AutoFillListPopupWindowBase)localObject).EU = locala;
      if (((AutoFillListPopupWindowBase)localObject).EU != null) {
        locala.registerDataSetObserver(((AutoFillListPopupWindowBase)localObject).mObserver);
      }
      if (((AutoFillListPopupWindowBase)localObject).jEL != null) {
        ((AutoFillListPopupWindowBase)localObject).jEL.setAdapter(((AutoFillListPopupWindowBase)localObject).EU);
      }
      paramInput.jEv.jED = paramAppBrandPageView;
      if (!"screen".equalsIgnoreCase(parama.jFG)) {
        break label259;
      }
    }
    label259:
    for (int i = f.jES;; i = f.jET)
    {
      if (i != 0) {
        paramInput.jEw = i;
      }
      paramInput.acN();
      GMTrace.o(18258174410752L, 136034);
      return;
      if (((AutoFillListPopupWindowBase)localObject).EU == null) {
        break;
      }
      ((AutoFillListPopupWindowBase)localObject).EU.unregisterDataSetObserver(((AutoFillListPopupWindowBase)localObject).mObserver);
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */