package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.a.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.net.URLDecoder;
import java.util.HashMap;
import org.json.JSONObject;

public final class JsApiScanCode
  extends a
{
  public static final int CTRL_INDEX = 148;
  public static final String NAME = "scanCode";
  public static volatile boolean iQV;
  
  static
  {
    GMTrace.i(10337583628288L, 77021);
    iQV = false;
    GMTrace.o(10337583628288L, 77021);
  }
  
  public JsApiScanCode()
  {
    GMTrace.i(10337180975104L, 77018);
    GMTrace.o(10337180975104L, 77018);
  }
  
  public final void a(final com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10337315192832L, 77019);
    if (iQV)
    {
      paramk.v(paramInt, d("cancel", null));
      GMTrace.o(10337315192832L, 77019);
      return;
    }
    iQV = true;
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10337315192832L, 77019);
      return;
    }
    localMMActivity.vow = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(10331275395072L, 76974);
        JsApiScanCode.iQV = false;
        if (paramAnonymousInt1 != (JsApiScanCode.this.hashCode() & 0xFFFF))
        {
          GMTrace.o(10331275395072L, 76974);
          return;
        }
        final Object localObject;
        int i;
        switch (paramAnonymousInt2)
        {
        default: 
          paramk.v(paramInt, JsApiScanCode.this.d("fail", null));
          GMTrace.o(10331275395072L, 76974);
          return;
        case -1: 
          if (paramAnonymousIntent != null)
          {
            localObject = paramAnonymousIntent.getStringExtra("key_scan_result");
            i = paramAnonymousIntent.getIntExtra("key_scan_result_type", 0);
            paramAnonymousInt2 = paramAnonymousIntent.getIntExtra("key_scan_result_code_type", 0);
            paramAnonymousInt1 = paramAnonymousIntent.getIntExtra("key_scan_result_code_version", 0);
            paramAnonymousIntent = (Intent)localObject;
          }
          break;
        }
        for (;;)
        {
          final HashMap localHashMap = new HashMap();
          localHashMap.put("charSet", "utf-8");
          if (i != 1)
          {
            localObject = paramAnonymousIntent.split(",");
            if (localObject.length > 1) {
              paramAnonymousIntent = localObject[1];
            }
            localHashMap.put("result", paramAnonymousIntent);
            if (localObject.length > 1) {}
            for (paramAnonymousIntent = localObject[0];; paramAnonymousIntent = "")
            {
              localHashMap.put("scanType", paramAnonymousIntent);
              paramk.v(paramInt, JsApiScanCode.this.d("ok", localHashMap));
              GMTrace.o(10331275395072L, 76974);
              return;
            }
          }
          if (paramAnonymousInt2 == 22) {}
          for (localObject = "";; localObject = paramAnonymousIntent)
          {
            localHashMap.put("result", localObject);
            localHashMap.put("scanType", "QR_CODE");
            localObject = new JsApiScanCode.GetA8KeyTask();
            ((JsApiScanCode.GetA8KeyTask)localObject).iRa = paramAnonymousIntent;
            ((JsApiScanCode.GetA8KeyTask)localObject).fwh = paramAnonymousInt2;
            ((JsApiScanCode.GetA8KeyTask)localObject).fwi = paramAnonymousInt1;
            ((JsApiScanCode.GetA8KeyTask)localObject).iRc = new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10330738524160L, 76970);
                localObject.VE();
                if (localObject.actionCode == 26)
                {
                  Uri localUri = Uri.parse(localObject.iRb);
                  String str = localUri.getQueryParameter("username");
                  if (JsApiScanCode.1.this.iPN.irS.iqO.ftu.equals(str)) {
                    localHashMap.put("path", URLDecoder.decode(bg.mY(localUri.getQueryParameter("path"))));
                  }
                }
                JsApiScanCode.1.this.iPN.v(JsApiScanCode.1.this.gQa, JsApiScanCode.this.d("ok", localHashMap));
                GMTrace.o(10330738524160L, 76970);
              }
            };
            ((JsApiScanCode.GetA8KeyTask)localObject).VD();
            AppBrandMainProcessService.a((MainProcessTask)localObject);
            GMTrace.o(10331275395072L, 76974);
            return;
          }
          paramk.v(paramInt, JsApiScanCode.this.d("cancel", null));
          GMTrace.o(10331275395072L, 76974);
          return;
          paramAnonymousInt2 = 0;
          i = 0;
          paramAnonymousIntent = "";
          paramAnonymousInt1 = 0;
        }
      }
    };
    paramk = new Intent();
    paramk.putExtra("BaseScanUI_select_scan_mode", 1);
    paramk.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
    paramk.putExtra("key_is_finish_on_scanned", true);
    paramk.putExtra("key_is_hide_right_btn", paramJSONObject.optBoolean("onlyFromCamera", false));
    com.tencent.mm.bi.d.a(localMMActivity, "scanner", ".ui.SingleTopScanUI", paramk, hashCode() & 0xFFFF, false);
    GMTrace.o(10337315192832L, 77019);
  }
  
  public static class GetA8KeyTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetA8KeyTask> CREATOR;
    public int actionCode;
    public int fwh;
    public int fwi;
    public String iRa;
    public String iRb;
    public Runnable iRc;
    
    static
    {
      GMTrace.i(10320135323648L, 76891);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10320135323648L, 76891);
    }
    
    public GetA8KeyTask()
    {
      GMTrace.i(10319195799552L, 76884);
      GMTrace.o(10319195799552L, 76884);
    }
    
    public final void RS()
    {
      GMTrace.i(10319330017280L, 76885);
      final a.b localb = ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).s(this.iRa, this.fwh, this.fwi);
      localb.a(new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(10473009315840L, 78030);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            JsApiScanCode.GetA8KeyTask.this.actionCode = -1;
            JsApiScanCode.GetA8KeyTask.a(JsApiScanCode.GetA8KeyTask.this);
            GMTrace.o(10473009315840L, 78030);
            return 0;
          }
          JsApiScanCode.GetA8KeyTask.this.actionCode = localb.KX();
          switch (JsApiScanCode.GetA8KeyTask.this.actionCode)
          {
          }
          for (JsApiScanCode.GetA8KeyTask.this.iRb = "";; JsApiScanCode.GetA8KeyTask.this.iRb = localb.KV())
          {
            JsApiScanCode.GetA8KeyTask.b(JsApiScanCode.GetA8KeyTask.this);
            GMTrace.o(10473009315840L, 78030);
            return 0;
          }
        }
      });
      GMTrace.o(10319330017280L, 76885);
    }
    
    public final void VB()
    {
      GMTrace.i(10319464235008L, 76886);
      if (this.iRc != null) {
        this.iRc.run();
      }
      GMTrace.o(10319464235008L, 76886);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(10319732670464L, 76888);
      this.iRa = paramParcel.readString();
      this.actionCode = paramParcel.readInt();
      this.iRb = paramParcel.readString();
      this.fwh = paramParcel.readInt();
      this.fwi = paramParcel.readInt();
      GMTrace.o(10319732670464L, 76888);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10319598452736L, 76887);
      paramParcel.writeString(this.iRa);
      paramParcel.writeInt(this.actionCode);
      paramParcel.writeString(this.iRb);
      paramParcel.writeInt(this.fwh);
      paramParcel.writeInt(this.fwi);
      GMTrace.o(10319598452736L, 76887);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiScanCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */