package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.support.v4.view.z;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static final class a
    implements View.OnTouchListener
  {
    private static volatile View jem;
    public q.b gQd;
    private String iqL;
    public Map<Integer, c.f> jen;
    public boolean jeo;
    private boolean jep;
    public c.f jeq;
    private Runnable jer;
    private int jes;
    public float jet;
    public MotionEvent jeu;
    public MotionEvent jev;
    public c.f jew;
    public c.f jex;
    public View mView;
    
    public a(AppBrandPageView paramAppBrandPageView, q.b paramb)
    {
      GMTrace.i(17674193076224L, 131683);
      this.jen = new HashMap();
      this.gQd = paramb;
      this.iqL = paramAppBrandPageView.iqL;
      this.jes = paramAppBrandPageView.hashCode();
      this.jet = ViewConfiguration.get(paramAppBrandPageView.mContext).getScaledTouchSlop();
      this.jew = new c.f();
      this.jex = new c.f();
      this.jer = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17676072124416L, 131697);
          if (!b.a.this.jeo)
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but pressed is false or pointer is null.");
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          Object localObject = c.bG(b.a.this.mView);
          if ((Math.abs(b.a.this.jeq.x - ((c.f)localObject).x) > 1.0F) || (Math.abs(b.a.this.jeq.y - ((c.f)localObject).y) > 1.0F))
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but view has moved.");
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          if (b.a.this.jen.size() != 1)
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but more then one point.");
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          if ((Math.abs(b.a.this.jew.x - b.a.this.jex.x) > b.a.this.jet) || (Math.abs(b.a.this.jew.y - b.a.this.jex.y) > b.a.this.jet))
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but point has moved(%s, %s, %s, %s).", new Object[] { Float.valueOf(b.a.this.jew.x), Float.valueOf(b.a.this.jex.x), Float.valueOf(b.a.this.jew.y), Float.valueOf(b.a.this.jex.y) });
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, publish event(%s, %s, %s, %s).", new Object[] { Float.valueOf(b.a.this.jew.x), Float.valueOf(b.a.this.jex.x), Float.valueOf(b.a.this.jew.y), Float.valueOf(b.a.this.jex.y) });
          localObject = new JSONObject();
          try
          {
            ((JSONObject)localObject).put("data", b.a.this.gQd.getString("data", ""));
            ((JSONObject)localObject).put("touch", b.a.this.jew.or());
            if (!b.a.this.gQd.getBoolean("disableScroll", false))
            {
              b.a.this.jeu = MotionEvent.obtain(b.a.this.jev);
              b.a.this.jeu.setAction(0);
              b.a.this.gQd.o("fakeDownEvent", true);
              b.a.this.mView.getParent().requestDisallowInterceptTouchEvent(true);
              b.a.this.mView.setDuplicateParentStateEnabled(false);
              b.a.this.a(b.a.this.mView, MotionEvent.obtain(b.a.this.jeu));
            }
            b.a.this.a(new c.a(), ((JSONObject)localObject).toString());
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          catch (JSONException localJSONException)
          {
            for (;;) {}
          }
        }
      };
      GMTrace.o(17674193076224L, 131683);
    }
    
    private void a(c.f paramf, e parame, String paramString)
    {
      GMTrace.i(17674729947136L, 131687);
      if (paramf == null)
      {
        GMTrace.o(17674729947136L, 131687);
        return;
      }
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("data", paramString);
        localJSONObject.put("touch", paramf.or());
        a(parame, localJSONObject.toString());
        GMTrace.o(17674729947136L, 131687);
        return;
      }
      catch (JSONException paramf)
      {
        for (;;) {}
      }
    }
    
    private void f(View paramView, boolean paramBoolean)
    {
      GMTrace.i(17674595729408L, 131686);
      this.mView = paramView;
      this.jeo = paramBoolean;
      if (!paramBoolean)
      {
        this.gQd.o("fakeDownEvent", false);
        this.gQd.o("onLongClick", false);
        this.mView.removeCallbacks(this.jer);
        this.jew.b(-1, 0.0F, 0.0F);
        this.jeu = null;
      }
      GMTrace.o(17674595729408L, 131686);
    }
    
    private c.f[] x(MotionEvent paramMotionEvent)
    {
      int j = 0;
      GMTrace.i(17674998382592L, 131689);
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramMotionEvent.getPointerCount())
      {
        int k = paramMotionEvent.getPointerId(i);
        c.f localf = (c.f)this.jen.get(Integer.valueOf(k));
        if (localf != null)
        {
          localf.x = paramMotionEvent.getX(i);
          localf.y = paramMotionEvent.getY(i);
          localArrayList.add(localf);
        }
        i += 1;
      }
      paramMotionEvent = new c.f[localArrayList.size()];
      i = j;
      while (i < localArrayList.size())
      {
        paramMotionEvent[i] = ((c.f)localArrayList.get(i));
        i += 1;
      }
      GMTrace.o(17674998382592L, 131689);
      return paramMotionEvent;
    }
    
    public final void a(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(17674327293952L, 131684);
      for (;;)
      {
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent == null) || (!(localViewParent instanceof ViewGroup)))
        {
          paramView.dispatchTouchEvent(paramMotionEvent);
          GMTrace.o(17674327293952L, 131684);
          return;
        }
        ViewGroup localViewGroup = (ViewGroup)localViewParent;
        float f1 = localViewGroup.getScrollX();
        float f2 = paramView.getX();
        float f3 = localViewGroup.getScrollY();
        float f4 = paramView.getY();
        paramMotionEvent.offsetLocation(-(f1 - f2), -(f3 - f4));
        paramView = (View)localViewParent;
      }
    }
    
    public final void a(e parame, String paramString)
    {
      GMTrace.i(17674864164864L, 131688);
      parame = parame.aj(this.iqL, this.jes);
      parame.mData = paramString;
      parame.VI();
      GMTrace.o(17674864164864L, 131688);
    }
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(17674461511680L, 131685);
      if ((jem != null) && (!jem.equals(paramView)))
      {
        GMTrace.o(17674461511680L, 131685);
        return false;
      }
      this.jev = paramMotionEvent;
      int k = paramMotionEvent.getActionMasked();
      int i = paramMotionEvent.getActionIndex();
      paramMotionEvent.getPointerCount();
      int j = paramMotionEvent.getPointerId(i);
      float f1 = paramMotionEvent.getX(i);
      float f2 = paramMotionEvent.getY(i);
      String str = "";
      boolean bool5 = false;
      boolean bool2 = false;
      boolean bool1 = false;
      if (this.gQd != null)
      {
        if ((k != 0) && (!this.gQd.gj("isTouching")) && (!z.al(paramView)) && (paramMotionEvent.getActionMasked() != 3))
        {
          GMTrace.o(17674461511680L, 131685);
          return false;
        }
        str = this.gQd.getString("data", "");
        bool5 = this.gQd.getBoolean("disableScroll", false);
        bool2 = this.gQd.getBoolean("fakeDownEvent", false);
        bool1 = this.gQd.getBoolean("onLongClick", false);
        this.jep = this.gQd.getBoolean("enableLongClick", false);
      }
      this.jex.b(j, f1, f2);
      boolean bool3 = bool5 | bool1;
      boolean bool4 = bool3;
      switch (k)
      {
      default: 
        bool4 = bool3;
      }
      for (;;)
      {
        GMTrace.o(17674461511680L, 131685);
        return bool4;
        i = 0;
        Object localObject;
        if (i < paramMotionEvent.getPointerCount())
        {
          f1 = paramMotionEvent.getX(i);
          f2 = paramMotionEvent.getY(i);
          j = paramMotionEvent.getPointerId(i);
          localObject = (c.f)this.jen.get(Integer.valueOf(j));
          if ((localObject != null) && ((f1 != ((c.f)localObject).x) || (f2 != ((c.f)localObject).y)))
          {
            i = 1;
            label379:
            bool4 = bool3;
            if (i == 0) {
              continue;
            }
            if ((this.jen.size() == 1) && (this.jeo) && ((Math.abs(this.jew.x - this.jex.x) > this.jet) || (Math.abs(this.jew.y - this.jex.y) > this.jet))) {
              f(paramView, false);
            }
            paramView = new JSONObject();
            localObject = new JSONArray();
          }
        }
        try
        {
          paramView.put("data", str);
          paramView.put("touches", localObject);
          paramMotionEvent = x(paramMotionEvent);
          if (paramMotionEvent.length > 0)
          {
            i = 0;
            for (;;)
            {
              if (i < paramMotionEvent.length)
              {
                ((JSONArray)localObject).put(paramMotionEvent[i].or());
                i += 1;
                continue;
                i += 1;
                break;
                i = 0;
                break label379;
              }
            }
          }
          bool4 = bool3;
          if (this.jen.size() == 0) {
            continue;
          }
          a(new c.d(), paramView.toString());
          bool4 = bool3;
          continue;
          bool4 = bool2;
          if (this.jeu != null)
          {
            bool4 = bool2;
            if (paramMotionEvent.getDownTime() != this.jeu.getDownTime())
            {
              bool4 = false;
              if (this.gQd != null) {
                this.gQd.o("fakeDownEvent", false);
              }
              w.v("MicroMsg.OnTouchListenerImpl", "try to handle fake event failed");
            }
          }
          if ((bool5) || (bool4))
          {
            paramView.getParent().requestDisallowInterceptTouchEvent(true);
            paramView.setDuplicateParentStateEnabled(false);
            w.i("MicroMsg.OnTouchListenerImpl", "onLongClick fake down event.");
            label692:
            if (!bool4) {
              break label979;
            }
            bool3 = true;
            bool5 = true;
            bool2 = bool5;
            bool1 = bool3;
            if (this.gQd != null)
            {
              this.gQd.o("fakeDownEvent", false);
              this.gQd.o("onLongClick", true);
              bool1 = bool3;
              bool2 = bool5;
            }
            label748:
            if (this.gQd != null) {
              this.gQd.o("isTouching", true);
            }
            if ((this.jep) && (!bool1) && (!this.jen.containsKey(Integer.valueOf(j)))) {
              paramView.postDelayed(this.jer, ViewConfiguration.getLongPressTimeout());
            }
            bool3 = bool2;
            bool2 = bool4;
            if ((f1 < 0.0F) || (f2 < 0.0F) || (f1 > paramView.getWidth()) || (f2 > paramView.getHeight())) {
              break label1010;
            }
            i = 1;
            label854:
            bool4 = bool3;
            if (i == 0) {
              continue;
            }
            paramMotionEvent = new c.f(j, f1, f2);
            if ((k != 0) || (bool1)) {
              break label1016;
            }
          }
          label979:
          label1010:
          label1016:
          for (bool1 = true;; bool1 = false)
          {
            f(paramView, bool1);
            if (!this.jen.containsKey(Integer.valueOf(j))) {
              break label1377;
            }
            i = 1;
            this.jen.put(Integer.valueOf(j), paramMotionEvent);
            bool4 = bool3;
            if (bool2) {
              break;
            }
            bool4 = bool3;
            if (i != 0) {
              break;
            }
            a(paramMotionEvent, new c.c(), str);
            bool4 = bool3;
            break;
            paramView.setDuplicateParentStateEnabled(true);
            break label692;
            jem = paramView;
            this.jeq = c.bG(paramView);
            this.jew.b(j, f1, f2);
            bool2 = bool3;
            break label748;
            i = 0;
            break label854;
          }
          if ((bool5) || (bool1)) {
            paramView.getParent().requestDisallowInterceptTouchEvent(false);
          }
          for (;;)
          {
            jem = null;
            if (this.gQd != null)
            {
              this.gQd.o("isTouching", false);
              if (this.gQd.containsKey("disableScroll-nextState")) {
                this.gQd.o("disableScroll", this.gQd.getBoolean("disableScroll-nextState", bool5));
              }
            }
            paramMotionEvent = (c.f)this.jen.remove(Integer.valueOf(j));
            bool4 = bool3;
            if (paramMotionEvent == null) {
              break;
            }
            f(paramView, false);
            a(paramMotionEvent, new c.e(), str);
            bool4 = bool3;
            break;
            paramView.setDuplicateParentStateEnabled(false);
          }
          jem = null;
          f(paramView, false);
          if ((bool5) || (bool1))
          {
            paramView.getParent().requestDisallowInterceptTouchEvent(false);
            if (this.gQd != null)
            {
              this.gQd.o("isTouching", false);
              if (this.gQd.containsKey("disableScroll-nextState")) {
                this.gQd.o("disableScroll", this.gQd.getBoolean("disableScroll-nextState", bool5));
              }
            }
            if (!z.al(paramView)) {
              break label1351;
            }
            paramView = new JSONObject();
            localObject = new JSONArray();
          }
          try
          {
            paramView.put("data", str);
            paramView.put("touches", localObject);
            paramMotionEvent = x(paramMotionEvent);
            i = 0;
            for (;;)
            {
              if (i < paramMotionEvent.length)
              {
                ((JSONArray)localObject).put(paramMotionEvent[i].or());
                i += 1;
                continue;
                paramView.setDuplicateParentStateEnabled(false);
                break;
              }
            }
            a(new c.b(), paramView.toString());
            label1351:
            this.jen.clear();
            bool4 = bool3;
          }
          catch (JSONException localJSONException1)
          {
            for (;;) {}
          }
        }
        catch (JSONException localJSONException2)
        {
          for (;;)
          {
            continue;
            label1377:
            i = 0;
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */