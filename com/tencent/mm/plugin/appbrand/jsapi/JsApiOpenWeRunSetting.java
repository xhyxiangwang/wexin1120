package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.a.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.sport.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class JsApiOpenWeRunSetting
  extends a
{
  public static final int CTRL_INDEX = 228;
  public static final String NAME = "openWeRunSetting";
  private OpenWeRunSetting iQK;
  
  public JsApiOpenWeRunSetting()
  {
    GMTrace.i(15465506144256L, 115227);
    GMTrace.o(15465506144256L, 115227);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool = true;
    GMTrace.i(15465640361984L, 115228);
    if (paramJSONObject != null) {
      bool = paramJSONObject.optBoolean("checkSupport", true);
    }
    this.iQK = new OpenWeRunSetting(this, paramk, paramInt, bool);
    this.iQK.VD();
    AppBrandMainProcessService.a(this.iQK);
    GMTrace.o(15465640361984L, 115228);
  }
  
  private static class OpenWeRunSetting
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OpenWeRunSetting> CREATOR;
    private boolean fPo;
    public d iQA;
    public k iQB;
    public int iQC;
    public boolean iQL;
    private boolean iQM;
    
    static
    {
      GMTrace.i(15470203764736L, 115262);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15470203764736L, 115262);
    }
    
    public OpenWeRunSetting(Parcel paramParcel)
    {
      GMTrace.i(15469130022912L, 115254);
      this.iQL = false;
      this.fPo = false;
      f(paramParcel);
      GMTrace.o(15469130022912L, 115254);
    }
    
    public OpenWeRunSetting(d paramd, k paramk, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(19802752024576L, 147542);
      this.iQL = false;
      this.fPo = false;
      w.i("MicroMsg.JsApiOpenWeRunSetting", "OpenWeRunSetting");
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      this.iQM = paramBoolean;
      GMTrace.o(19802752024576L, 147542);
    }
    
    public final void RS()
    {
      GMTrace.i(15469264240640L, 115255);
      this.iQL = ((b)h.h(b.class)).dg(ab.getContext());
      if ((this.iQM) && (!this.iQL))
      {
        ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a(new a.a()
        {
          public final void i(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
          {
            GMTrace.i(19815368491008L, 147636);
            JsApiOpenWeRunSetting.OpenWeRunSetting localOpenWeRunSetting = JsApiOpenWeRunSetting.OpenWeRunSetting.this;
            if ((paramAnonymousBoolean1) && (paramAnonymousBoolean2)) {}
            for (boolean bool = true;; bool = false)
            {
              localOpenWeRunSetting.iQL = bool;
              w.i("MicroMsg.JsApiOpenWeRunSetting", "After getUserState requestOk %b, hasStep %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean1), Boolean.valueOf(paramAnonymousBoolean2) });
              JsApiOpenWeRunSetting.OpenWeRunSetting.this.VM();
              GMTrace.o(19815368491008L, 147636);
              return;
            }
          }
        });
        GMTrace.o(15469264240640L, 115255);
        return;
      }
      VM();
      GMTrace.o(15469264240640L, 115255);
    }
    
    public final void VB()
    {
      GMTrace.i(15469398458368L, 115256);
      if ((this.iQM) && (!this.iQL))
      {
        this.iQB.v(this.iQC, this.iQA.d("fail device not support", null));
        VE();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      if (this.fPo)
      {
        this.iQB.v(this.iQC, this.iQA.d("ok", null));
        VE();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      MMActivity localMMActivity = this.iQA.a(this.iQB);
      if (localMMActivity == null)
      {
        this.iQB.v(this.iQC, this.iQA.d("fail", null));
        VE();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(this.iQB.iqL);
      if ((localAppBrandSysConfig == null) || (bg.mZ(localAppBrandSysConfig.fxq)))
      {
        this.iQB.v(this.iQC, this.iQA.d("fail", null));
        VE();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("OpenWeRunSettingName", localAppBrandSysConfig.fxq);
      localMMActivity.vow = new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(18243947331584L, 135928);
          if (paramAnonymousInt1 != (JsApiOpenWeRunSetting.OpenWeRunSetting.this.hashCode() & 0xFFFF))
          {
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.VE();
            GMTrace.o(18243947331584L, 135928);
            return;
          }
          if (paramAnonymousInt2 == -1)
          {
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQB.v(JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQC, JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQA.d("ok", null));
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.VE();
            GMTrace.o(18243947331584L, 135928);
            return;
          }
          if (paramAnonymousInt2 == 0)
          {
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQB.v(JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQC, JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQA.d("cancel", null));
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.VE();
            GMTrace.o(18243947331584L, 135928);
            return;
          }
          JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQB.v(JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQC, JsApiOpenWeRunSetting.OpenWeRunSetting.this.iQA.d("fail", null));
          JsApiOpenWeRunSetting.OpenWeRunSetting.this.VE();
          GMTrace.o(18243947331584L, 135928);
        }
      };
      com.tencent.mm.bi.d.a(localMMActivity, "appbrand", ".ui.AppBrandOpenWeRunSettingUI", localIntent, hashCode() & 0xFFFF, false);
      VE();
      GMTrace.o(15469398458368L, 115256);
    }
    
    public final void VM()
    {
      GMTrace.i(18205426843648L, 135641);
      if ((!this.iQM) || (this.iQL))
      {
        this.fPo = ((b)h.h(b.class)).boW();
        if ((this.iQM) && (this.fPo)) {
          ((b)h.h(b.class)).boV();
        }
      }
      VC();
      GMTrace.o(18205426843648L, 135641);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(15469532676096L, 115257);
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.iQL = bool1;
        if (paramParcel.readByte() == 0) {
          break label66;
        }
        bool1 = true;
        label33:
        this.fPo = bool1;
        if (paramParcel.readByte() == 0) {
          break label71;
        }
      }
      label66:
      label71:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.iQM = bool1;
        GMTrace.o(15469532676096L, 115257);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label33;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(15469666893824L, 115258);
      if (this.iQL)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.fPo) {
          break label68;
        }
        b1 = 1;
        label34:
        paramParcel.writeByte(b1);
        if (!this.iQM) {
          break label73;
        }
      }
      label68:
      label73:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        GMTrace.o(15469666893824L, 115258);
        return;
        b1 = 0;
        break;
        b1 = 0;
        break label34;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiOpenWeRunSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */