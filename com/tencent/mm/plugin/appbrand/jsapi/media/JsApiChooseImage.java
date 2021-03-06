package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.a.a;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.b;
import com.tencent.mm.plugin.appbrand.o.b;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.base.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiChooseImage
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 29;
  public static final String NAME = "chooseImage";
  public static volatile boolean iXM;
  
  static
  {
    GMTrace.i(19796846444544L, 147498);
    iXM = false;
    GMTrace.o(19796846444544L, 147498);
  }
  
  public JsApiChooseImage()
  {
    GMTrace.i(19796309573632L, 147494);
    GMTrace.o(19796309573632L, 147494);
  }
  
  public static <T> String i(ArrayList<T> paramArrayList)
  {
    GMTrace.i(19796578009088L, 147496);
    if (paramArrayList.size() == 0)
    {
      w.e("MicroMsg.JsApiChooseImage", "data is null");
      GMTrace.o(19796578009088L, 147496);
      return null;
    }
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    while (i < paramArrayList.size())
    {
      localJSONArray.put(paramArrayList.get(i));
      i += 1;
    }
    paramArrayList = localJSONArray.toString();
    GMTrace.o(19796578009088L, 147496);
    return paramArrayList;
  }
  
  public static <T> JSONArray j(ArrayList<T> paramArrayList)
  {
    GMTrace.i(19796712226816L, 147497);
    if (paramArrayList.size() == 0)
    {
      w.e("MicroMsg.JsApiChooseImage", "data is null");
      GMTrace.o(19796712226816L, 147497);
      return null;
    }
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    while (i < paramArrayList.size())
    {
      localJSONArray.put(paramArrayList.get(i));
      i += 1;
    }
    GMTrace.o(19796712226816L, 147497);
    return localJSONArray;
  }
  
  public final void a(final com.tencent.mm.plugin.appbrand.k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19796443791360L, 147495);
    if (iXM)
    {
      paramk.v(paramInt, d("cancel", null));
      GMTrace.o(19796443791360L, 147495);
      return;
    }
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19796443791360L, 147495);
      return;
    }
    ChooseRequest localChooseRequest = new ChooseRequest();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("sourceType");
    String str1 = paramJSONObject.optString("sizeType");
    String str2 = paramJSONObject.optString("count");
    w.i("MicroMsg.JsApiChooseImage", "doChooseImage sourceType = %s, sizeType = %s, count = %s", new Object[] { localJSONArray, str1, str2 });
    int i;
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
    {
      localChooseRequest.iXO = true;
      localChooseRequest.iXP = true;
      if (!localChooseRequest.iXO) {
        break label287;
      }
      com.tencent.mm.plugin.appbrand.a.a(paramk.iqL, new a.a()
      {
        public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
        {
          GMTrace.i(19772955688960L, 147320);
          if (paramAnonymousInt != 113)
          {
            GMTrace.o(19772955688960L, 147320);
            return;
          }
          if (paramAnonymousArrayOfInt[0] == 0)
          {
            JsApiChooseImage.this.a(paramk, paramJSONObject, paramInt);
            GMTrace.o(19772955688960L, 147320);
            return;
          }
          paramk.v(paramInt, JsApiChooseImage.this.d("fail:system permission denied", null));
          GMTrace.o(19772955688960L, 147320);
        }
      });
      paramJSONObject = a(paramk);
      if (paramJSONObject != null) {
        break label250;
      }
      paramk.v(paramInt, d("fail", null));
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        break label287;
      }
      GMTrace.o(19796443791360L, 147495);
      return;
      localChooseRequest.iXO = localJSONArray.toString().contains("camera");
      localChooseRequest.iXP = localJSONArray.toString().contains("album");
      break;
      label250:
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(paramJSONObject, "android.permission.CAMERA", 113, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nw(paramk.iqL);
        i = bool;
      }
    }
    label287:
    iXM = true;
    com.tencent.mm.plugin.appbrand.d.a(paramk.iqL, new d.b()
    {
      public final void onResume()
      {
        GMTrace.i(19790538211328L, 147451);
        JsApiChooseImage.iXM = false;
        com.tencent.mm.plugin.appbrand.d.b(paramk.iqL, this);
        GMTrace.o(19790538211328L, 147451);
      }
    });
    paramJSONObject = str1;
    if (bg.mZ(str1)) {
      paramJSONObject = "compressed";
    }
    localChooseRequest.iXQ = paramJSONObject.contains("compressed");
    localChooseRequest.iXR = paramJSONObject.contains("original");
    localChooseRequest.count = bg.getInt(str2, 9);
    localChooseRequest.appId = paramk.iqL;
    com.tencent.mm.plugin.appbrand.ipc.a.b(localMMActivity, localChooseRequest, new AppBrandProxyUIProcessTask.b() {});
    GMTrace.o(19796443791360L, 147495);
  }
  
  private static final class ChooseRequest
    extends AppBrandProxyUIProcessTask.ProcessRequest
  {
    public static final Parcelable.Creator<ChooseRequest> CREATOR;
    String appId;
    int count;
    boolean iXO;
    boolean iXP;
    boolean iXQ;
    boolean iXR;
    
    static
    {
      GMTrace.i(19801409847296L, 147532);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19801409847296L, 147532);
    }
    
    ChooseRequest()
    {
      GMTrace.i(19801141411840L, 147530);
      GMTrace.o(19801141411840L, 147530);
    }
    
    ChooseRequest(Parcel paramParcel)
    {
      GMTrace.i(19801275629568L, 147531);
      h(paramParcel);
      GMTrace.o(19801275629568L, 147531);
    }
    
    protected final boolean Vx()
    {
      GMTrace.i(19801007194112L, 147529);
      GMTrace.o(19801007194112L, 147529);
      return true;
    }
    
    protected final String Vy()
    {
      GMTrace.i(19800872976384L, 147528);
      GMTrace.o(19800872976384L, 147528);
      return "GalleryChooseImage";
    }
    
    protected final Class<? extends AppBrandProxyUIProcessTask> Vz()
    {
      GMTrace.i(19800336105472L, 147524);
      GMTrace.o(19800336105472L, 147524);
      return JsApiChooseImage.a.class;
    }
    
    public final int describeContents()
    {
      GMTrace.i(19800604540928L, 147526);
      GMTrace.o(19800604540928L, 147526);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19800470323200L, 147525);
      this.appId = paramParcel.readString();
      this.count = paramParcel.readInt();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.iXO = bool1;
        if (paramParcel.readByte() == 0) {
          break label96;
        }
        bool1 = true;
        label49:
        this.iXP = bool1;
        if (paramParcel.readByte() == 0) {
          break label101;
        }
        bool1 = true;
        label63:
        this.iXQ = bool1;
        if (paramParcel.readByte() == 0) {
          break label106;
        }
      }
      label96:
      label101:
      label106:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.iXR = bool1;
        GMTrace.o(19800470323200L, 147525);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label49;
        bool1 = false;
        break label63;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(19800738758656L, 147527);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.count);
      if (this.iXO)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.iXP) {
          break label98;
        }
        b1 = 1;
        label50:
        paramParcel.writeByte(b1);
        if (!this.iXQ) {
          break label103;
        }
        b1 = 1;
        label64:
        paramParcel.writeByte(b1);
        if (!this.iXR) {
          break label108;
        }
      }
      label98:
      label103:
      label108:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        GMTrace.o(19800738758656L, 147527);
        return;
        b1 = 0;
        break;
        b1 = 0;
        break label50;
        b1 = 0;
        break label64;
      }
    }
  }
  
  private static final class ChooseResult
    extends AppBrandProxyUIProcessTask.ProcessResult
  {
    public static final Parcelable.Creator<ChooseResult> CREATOR;
    int aHi;
    ArrayList<AppBrandLocalMediaObject> iXS;
    
    static
    {
      GMTrace.i(19772687253504L, 147318);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19772687253504L, 147318);
    }
    
    ChooseResult()
    {
      GMTrace.i(19772418818048L, 147316);
      GMTrace.o(19772418818048L, 147316);
    }
    
    ChooseResult(Parcel paramParcel)
    {
      super();
      GMTrace.i(19772553035776L, 147317);
      GMTrace.o(19772553035776L, 147317);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19772150382592L, 147314);
      GMTrace.o(19772150382592L, 147314);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      GMTrace.i(19772016164864L, 147313);
      this.aHi = paramParcel.readInt();
      this.iXS = paramParcel.createTypedArrayList(AppBrandLocalMediaObject.CREATOR);
      GMTrace.o(19772016164864L, 147313);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19772284600320L, 147315);
      paramParcel.writeInt(this.aHi);
      paramParcel.writeTypedList(this.iXS);
      GMTrace.o(19772284600320L, 147315);
    }
  }
  
  private static final class a
    extends AppBrandProxyUIProcessTask
  {
    JsApiChooseImage.ChooseRequest iXT;
    JsApiChooseImage.ChooseResult iXU;
    int iXV;
    private q iXW;
    private DialogInterface.OnCancelListener iXX;
    
    private a()
    {
      GMTrace.i(19774029430784L, 147328);
      this.iXU = new JsApiChooseImage.ChooseResult();
      GMTrace.o(19774029430784L, 147328);
    }
    
    private void iB(int paramInt)
    {
      GMTrace.i(19774297866240L, 147330);
      this.iXX = new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19786645897216L, 147422);
          JsApiChooseImage.a.this.iXU.aHi = 0;
          JsApiChooseImage.a.a(JsApiChooseImage.a.this, JsApiChooseImage.a.this.iXU);
          GMTrace.o(19786645897216L, 147422);
        }
      };
      MMActivity localMMActivity = Vu();
      int i = p.i.dxm;
      ab.getResources().getString(i);
      this.iXW = h.a(localMMActivity, ab.getResources().getString(paramInt), true, this.iXX);
      GMTrace.o(19774297866240L, 147330);
    }
    
    public static String qh(String paramString)
    {
      GMTrace.i(19774432083968L, 147331);
      int i = Exif.fromFile(paramString).getOrientationInDegree();
      if (i != 0) {
        try
        {
          Object localObject = new BitmapFactory.Options();
          Bitmap localBitmap = MMBitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject, 0);
          if (localBitmap == null)
          {
            w.e("MicroMsg.JsApiChooseImage", "rotate image, get null bmp");
            GMTrace.o(19774432083968L, 147331);
            return paramString;
          }
          float f = i % 360;
          localBitmap = com.tencent.mm.sdk.platformtools.d.b(localBitmap, f);
          String str = e.gKA + "microMsg." + System.currentTimeMillis() + ".jpg";
          if (b.a((BitmapFactory.Options)localObject)) {}
          for (localObject = Bitmap.CompressFormat.JPEG;; localObject = Bitmap.CompressFormat.PNG) {
            try
            {
              com.tencent.mm.sdk.platformtools.d.a(localBitmap, 100, (Bitmap.CompressFormat)localObject, str, true);
              GMTrace.o(19774432083968L, 147331);
              return str;
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.JsApiChooseImage", "rotate image, exception occurred when saving | %s", new Object[] { localException });
              GMTrace.o(19774432083968L, 147331);
              return paramString;
            }
          }
          GMTrace.o(19774432083968L, 147331);
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          GMTrace.o(19774432083968L, 147331);
          return paramString;
        }
        catch (NullPointerException localNullPointerException)
        {
          GMTrace.o(19774432083968L, 147331);
          return paramString;
        }
      }
      return paramString;
    }
    
    public static String qi(String paramString)
    {
      GMTrace.i(19774566301696L, 147332);
      String str = e.gKA + "microMsg." + System.currentTimeMillis() + ".jpg";
      try
      {
        Bitmap localBitmap1 = MMBitmapFactory.decodeFile(paramString, 0);
        if (localBitmap1 == null)
        {
          w.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp return null");
          GMTrace.o(19774566301696L, 147332);
          return null;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError1)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp oom");
          try
          {
            Bitmap localBitmap2 = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString, null);
          }
          catch (OutOfMemoryError localOutOfMemoryError2)
          {
            w.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp oom retry, oom again");
            Object localObject1 = null;
          }
          catch (Exception localException1)
          {
            w.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp oom retry, e " + localException1);
            Object localObject2 = null;
          }
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          try
          {
            Bitmap localBitmap3 = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString, null);
          }
          catch (Exception localException2)
          {
            w.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp npe retry, e " + localException2);
            Object localObject3 = null;
          }
        }
      }
      catch (Exception localException3)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp e " + localException3);
          Object localObject4 = null;
        }
        long l = bg.Pp();
        boolean bool = b.bk(str, paramString);
        w.i("MicroMsg.JsApiChooseImage", "doCompressImage, ret = %b, cost = %d, %s (%d) -> %s (%d)", new Object[] { Boolean.valueOf(bool), Long.valueOf(bg.Pp() - l), paramString, Long.valueOf(new File(paramString).length()), str, Long.valueOf(new File(str).length()) });
        if (bool)
        {
          GMTrace.o(19774566301696L, 147332);
          return str;
        }
        GMTrace.o(19774566301696L, 147332);
      }
      return paramString;
    }
    
    protected final void Vw()
    {
      GMTrace.i(19774700519424L, 147333);
      super.Vw();
      if (this.iXW != null)
      {
        this.iXW.dismiss();
        this.iXW = null;
      }
      GMTrace.o(19774700519424L, 147333);
    }
    
    public final void a(int paramInt1, int paramInt2, final Intent paramIntent)
    {
      GMTrace.i(19774834737152L, 147334);
      if (paramInt2 == 0)
      {
        this.iXU.aHi = 0;
        a(this.iXU);
        GMTrace.o(19774834737152L, 147334);
        return;
      }
      switch (paramInt1)
      {
      default: 
        this.iXU.aHi = -2;
        a(this.iXU);
        GMTrace.o(19774834737152L, 147334);
        return;
      case 1: 
      case 3: 
        if (paramIntent == null)
        {
          this.iXU.aHi = 0;
          a(this.iXU);
          GMTrace.o(19774834737152L, 147334);
          return;
        }
        final ArrayList localArrayList = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        final boolean bool2 = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
        final int i = this.iXT.iXQ;
        label196:
        final boolean bool1;
        if (!this.iXT.iXR)
        {
          paramInt1 = 1;
          if (((paramInt1 & i) == 0) && (!(this.iXT.iXQ & this.iXT.iXR & bool2))) {
            break label402;
          }
          i = 1;
          if ((!paramIntent.getBooleanExtra("isTakePhoto", false)) && (!paramIntent.getBooleanExtra("isPreviewPhoto", false))) {
            break label408;
          }
          bool1 = true;
          label221:
          w.d("MicroMsg.JsApiChooseImage", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(this.iXT.iXQ), Boolean.valueOf(this.iXT.iXR), Boolean.valueOf(bool2), Boolean.valueOf(i) });
          if (i != 0) {
            iB(p.i.iwz);
          }
          if (i != 0) {
            break label419;
          }
          if (bg.bX(localArrayList)) {
            break label414;
          }
          paramIntent = localArrayList.iterator();
          while (paramIntent.hasNext()) {
            if (Exif.fromFile((String)paramIntent.next()).getOrientationInDegree() != 0)
            {
              paramInt1 = 1;
              label345:
              if (paramInt1 == 0) {
                break label419;
              }
            }
          }
        }
        label402:
        label408:
        label414:
        label419:
        for (bool2 = true;; bool2 = false)
        {
          if (bool2) {
            iB(p.i.ixr);
          }
          com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19780203446272L, 147374);
              final ArrayList localArrayList = new ArrayList(localArrayList.size());
              Iterator localIterator = localArrayList.iterator();
              Object localObject1;
              boolean bool;
              if (localIterator.hasNext())
              {
                localObject1 = (String)localIterator.next();
                bool = bool1;
                if (i)
                {
                  localObject1 = JsApiChooseImage.a.qi((String)localObject1);
                  bool |= true;
                }
              }
              label178:
              for (;;)
              {
                Object localObject2 = c.c(JsApiChooseImage.a.this.iXT.appId, (String)localObject1, bool);
                if (localObject2 != null)
                {
                  localArrayList.add(localObject2);
                  break;
                  if (!bool2) {
                    break label178;
                  }
                  localObject2 = JsApiChooseImage.a.qh((String)localObject1);
                  if (((String)localObject2).equals(localObject1)) {
                    break label178;
                  }
                  bool |= true;
                  localObject1 = localObject2;
                  continue;
                }
                w.e("MicroMsg.JsApiChooseImage", "handle chosen list from gallery, get null obj from path: %s", new Object[] { localObject1 });
                break;
                af.u(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(19776311132160L, 147345);
                    JsApiChooseImage.a.this.iXU.aHi = -1;
                    JsApiChooseImage.a.this.iXU.iXS = localArrayList;
                    JsApiChooseImage.a.b(JsApiChooseImage.a.this, JsApiChooseImage.a.this.iXU);
                    GMTrace.o(19776311132160L, 147345);
                  }
                });
                GMTrace.o(19780203446272L, 147374);
                return;
              }
            }
          });
          GMTrace.o(19774834737152L, 147334);
          return;
          paramInt1 = 0;
          break;
          i = 0;
          break label196;
          bool1 = false;
          break label221;
          paramInt1 = 0;
          break label345;
        }
      }
      paramIntent = com.tencent.mm.pluginsdk.ui.tools.k.b(Vu().getApplicationContext(), paramIntent, e.gKA);
      if (bg.mZ(paramIntent))
      {
        w.w("MicroMsg.JsApiChooseImage", "take photo, but result is null");
        this.iXU.aHi = -2;
        a(this.iXU);
        GMTrace.o(19774834737152L, 147334);
        return;
      }
      w.i("MicroMsg.JsApiChooseImage", "take photo, result[%s]", new Object[] { paramIntent });
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19785706373120L, 147415);
          Intent localIntent = new Intent();
          if (!JsApiChooseImage.a.this.iXT.iXQ) {}
          for (boolean bool = true;; bool = false)
          {
            localIntent.putExtra("key_send_raw_image", bool);
            localIntent.putExtra("max_select_count", JsApiChooseImage.a.this.iXT.count);
            localIntent.putExtra("query_source_type", JsApiChooseImage.a.this.iXV);
            localIntent.putExtra("isPreviewPhoto", true);
            localIntent.putExtra("max_select_count", 1);
            ArrayList localArrayList = new ArrayList(1);
            localArrayList.add(paramIntent);
            localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
            localIntent.putExtra("preview_image", true);
            localIntent.addFlags(67108864);
            JsApiChooseImage.a.a(JsApiChooseImage.a.this, "gallery", ".ui.GalleryEntryUI", localIntent);
            GMTrace.o(19785706373120L, 147415);
            return;
          }
        }
      });
      GMTrace.o(19774834737152L, 147334);
    }
    
    protected final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
    {
      GMTrace.i(19774163648512L, 147329);
      this.iXT = ((JsApiChooseImage.ChooseRequest)paramProcessRequest);
      this.iXT.count = Math.max(1, Math.min(9, this.iXT.count));
      int i;
      if ((this.iXT.iXQ & this.iXT.iXR))
      {
        i = 8;
        this.iXV = i;
        if (bg.eD(Vu()) <= 200L) {
          break label212;
        }
        i = 1;
        label82:
        if (i == 0)
        {
          paramProcessRequest = Vu();
          i = p.i.iwy;
          t.makeText(paramProcessRequest, ab.getResources().getString(i), 1).show();
        }
        Vu().vow = this;
        paramProcessRequest = new Intent();
        if (this.iXT.iXQ) {
          break label217;
        }
      }
      label212:
      label217:
      for (boolean bool = true;; bool = false)
      {
        paramProcessRequest.putExtra("key_send_raw_image", bool);
        paramProcessRequest.putExtra("query_media_type", 1);
        if ((!this.iXT.iXO) || (!this.iXT.iXP)) {
          break label222;
        }
        com.tencent.mm.pluginsdk.ui.tools.k.a(Vu(), 1, this.iXT.count, this.iXV, paramProcessRequest);
        GMTrace.o(19774163648512L, 147329);
        return;
        i = 7;
        break;
        i = 0;
        break label82;
      }
      label222:
      if (this.iXT.iXP)
      {
        paramProcessRequest.putExtra("show_header_view", false);
        com.tencent.mm.pluginsdk.ui.tools.k.a(Vu(), 1, this.iXT.count, this.iXV, paramProcessRequest);
        GMTrace.o(19774163648512L, 147329);
        return;
      }
      if (this.iXT.iXO)
      {
        com.tencent.mm.pluginsdk.ui.tools.k.c(Vu(), e.gKA, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
        GMTrace.o(19774163648512L, 147329);
        return;
      }
      w.e("MicroMsg.JsApiChooseImage", "unknown scene, ignore this request");
      this.iXU.aHi = -2;
      a(this.iXU);
      GMTrace.o(19774163648512L, 147329);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/media/JsApiChooseImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */