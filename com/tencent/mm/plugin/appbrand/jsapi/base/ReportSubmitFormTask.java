package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.protocal.c.fh;
import com.tencent.mm.protocal.c.fi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReportSubmitFormTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<ReportSubmitFormTask> CREATOR;
  public String appId;
  public int fNP;
  public int ftx;
  public String iJY;
  public String iUu;
  public int type;
  
  static
  {
    GMTrace.i(10458916454400L, 77925);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10458916454400L, 77925);
  }
  
  public ReportSubmitFormTask()
  {
    GMTrace.i(10457976930304L, 77918);
    GMTrace.o(10457976930304L, 77918);
  }
  
  public ReportSubmitFormTask(String paramString)
  {
    GMTrace.i(10458111148032L, 77919);
    this.appId = paramString;
    this.ftx = a.nx(paramString).iJa.iCx;
    this.fNP = a.nx(paramString).iJa.iCy;
    GMTrace.o(10458111148032L, 77919);
  }
  
  static LinkedList<bte> Wg()
  {
    GMTrace.i(10458379583488L, 77921);
    localLinkedList = new LinkedList();
    Object localObject = (String)h.xz().xi().get(w.a.uZD, null);
    try
    {
      localObject = new JSONArray((String)localObject);
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        bte localbte = new bte();
        localbte.type = localJSONObject.getInt("type");
        localbte.fKY = localJSONObject.getString("appid");
        localbte.uHP = localJSONObject.getString("formid");
        localbte.uHQ = localJSONObject.getString("pageid");
        localbte.uHR = localJSONObject.getInt("appstate");
        localbte.uHS = localJSONObject.getInt("appversion");
        localLinkedList.add(localbte);
        i += 1;
      }
      return localLinkedList;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ReportSubmitFormTask", localException.getMessage());
      h.xz().xi().a(w.a.uZD, "");
      GMTrace.o(10458379583488L, 77921);
    }
  }
  
  public final void RS()
  {
    GMTrace.i(10458245365760L, 77920);
    Object localObject1 = new b.a();
    ((b.a)localObject1).hlX = new fh();
    ((b.a)localObject1).hlY = new fi();
    ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxausrevent/batchrecordwxatemplatemsgevent";
    ((b.a)localObject1).hlW = 1129;
    localObject1 = ((b.a)localObject1).DA();
    final fh localfh = (fh)((b)localObject1).hlU.hmc;
    localfh.tzg = new LinkedList();
    ??? = new bte();
    ((bte)???).type = this.type;
    ((bte)???).fKY = this.appId;
    ((bte)???).uHP = this.iUu;
    ((bte)???).uHQ = this.iJY;
    ((bte)???).uHR = this.ftx;
    ((bte)???).uHS = this.fNP;
    localfh.tzg.add(???);
    synchronized (getClass())
    {
      localfh.tzg.addAll(Wg());
      u.a((b)localObject1, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String arg3, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(10457305841664L, 77913);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            synchronized (ReportSubmitFormTask.this.getClass())
            {
              paramAnonymousk = localfh.tzg;
              paramAnonymousk.addAll(ReportSubmitFormTask.Wg());
              paramAnonymousb = new JSONArray();
              paramAnonymousk = paramAnonymousk.iterator();
              for (;;)
              {
                if (paramAnonymousk.hasNext())
                {
                  bte localbte = (bte)paramAnonymousk.next();
                  JSONObject localJSONObject = new JSONObject();
                  try
                  {
                    localJSONObject.put("type", localbte.type);
                    localJSONObject.put("appid", localbte.fKY);
                    localJSONObject.put("formid", localbte.uHP);
                    localJSONObject.put("pageid", localbte.uHQ);
                    localJSONObject.put("appstate", localbte.uHR);
                    localJSONObject.put("appversion", localbte.uHS);
                    paramAnonymousb.put(localJSONObject);
                  }
                  catch (Exception localException)
                  {
                    w.e("MicroMsg.ReportSubmitFormTask", localException.getMessage());
                  }
                }
              }
            }
            h.xz().xi().a(w.a.uZD, paramAnonymousb.toString());
            w.e("MicroMsg.ReportSubmitFormTask", "Error: %d, %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            GMTrace.o(10457305841664L, 77913);
            return 0;
          }
          GMTrace.o(10457305841664L, 77913);
          return 0;
        }
      });
      GMTrace.o(10458245365760L, 77920);
      return;
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10458648018944L, 77923);
    this.type = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.iUu = paramParcel.readString();
    this.iJY = paramParcel.readString();
    this.ftx = paramParcel.readInt();
    this.fNP = paramParcel.readInt();
    GMTrace.o(10458648018944L, 77923);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10458513801216L, 77922);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.iUu);
    paramParcel.writeString(this.iJY);
    paramParcel.writeInt(this.ftx);
    paramParcel.writeInt(this.fNP);
    GMTrace.o(10458513801216L, 77922);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/ReportSubmitFormTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */