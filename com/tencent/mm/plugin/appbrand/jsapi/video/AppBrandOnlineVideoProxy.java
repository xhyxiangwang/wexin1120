package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelvideo.b.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.appbrand.d.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class AppBrandOnlineVideoProxy
  implements com.tencent.mm.modelvideo.b
{
  private OnlineVideoProxy jbH;
  private b.a jbI;
  
  public AppBrandOnlineVideoProxy()
  {
    GMTrace.i(17339990933504L, 129193);
    GMTrace.o(17339990933504L, 129193);
  }
  
  public final void a(b.a parama)
  {
    GMTrace.i(17340662022144L, 129198);
    this.jbI = parama;
    if (this.jbH != null) {
      this.jbH.jbV = parama;
    }
    GMTrace.o(17340662022144L, 129198);
  }
  
  public final boolean aZ(int paramInt1, int paramInt2)
  {
    GMTrace.i(17340527804416L, 129197);
    if (this.jbH == null)
    {
      GMTrace.o(17340527804416L, 129197);
      return false;
    }
    OnlineVideoProxy localOnlineVideoProxy = this.jbH;
    localOnlineVideoProxy.offset = paramInt1;
    localOnlineVideoProxy.length = paramInt2;
    localOnlineVideoProxy.jbM = 3;
    AppBrandMainProcessService.b(localOnlineVideoProxy);
    boolean bool = localOnlineVideoProxy.jbS;
    GMTrace.o(17340527804416L, 129197);
    return bool;
  }
  
  public final void g(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17340393586688L, 129196);
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s requestVideoData [%s, %d %d]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.jbH != null)
    {
      paramString = this.jbH;
      paramString.offset = paramInt1;
      paramString.length = paramInt2;
      paramString.jbM = 2;
      AppBrandMainProcessService.a(paramString);
    }
    GMTrace.o(17340393586688L, 129196);
  }
  
  public final void lL(String paramString)
  {
    GMTrace.i(17340259368960L, 129195);
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s stop http stream[%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (this.jbH != null)
    {
      this.jbH.jbV = null;
      paramString = this.jbH;
      paramString.jbM = 4;
      AppBrandMainProcessService.a(paramString);
      this.jbH.VE();
    }
    this.jbH = null;
    GMTrace.o(17340259368960L, 129195);
  }
  
  public final void n(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(17340125151232L, 129194);
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s start http stream[%s, %s, %s]", new Object[] { Integer.valueOf(hashCode()), paramString1, paramString2, paramString3 });
    if (this.jbH == null)
    {
      this.jbH = new OnlineVideoProxy();
      this.jbH.jbV = this.jbI;
      this.jbH.VD();
    }
    OnlineVideoProxy localOnlineVideoProxy = this.jbH;
    w.i("MicroMsg.AppBrandOnlineVideoProxy", "%s OnlineVideoProxy start http stream[%s %s %s] ", new Object[] { Integer.valueOf(localOnlineVideoProxy.hashCode()), paramString1, paramString2, paramString3 });
    localOnlineVideoProxy.hSm = paramString1;
    localOnlineVideoProxy.path = paramString2;
    localOnlineVideoProxy.url = paramString3;
    localOnlineVideoProxy.jbM = 1;
    AppBrandMainProcessService.a(localOnlineVideoProxy);
    GMTrace.o(17340125151232L, 129194);
  }
  
  private static class OnlineVideoProxy
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OnlineVideoProxy> CREATOR;
    final int START;
    final int STOP;
    String hSm;
    final int jbJ;
    final int jbK;
    final int jbL;
    int jbM;
    final int jbN;
    final int jbO;
    final int jbP;
    final int jbQ;
    int jbR;
    boolean jbS;
    int jbT;
    int jbU;
    b.a jbV;
    d.c jbW;
    int length;
    int offset;
    String path;
    String url;
    
    static
    {
      GMTrace.i(17374753325056L, 129452);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17374753325056L, 129452);
    }
    
    public OnlineVideoProxy()
    {
      GMTrace.i(17373411147776L, 129442);
      this.jbJ = 0;
      this.START = 1;
      this.jbK = 2;
      this.jbL = 3;
      this.STOP = 4;
      this.jbN = 10;
      this.jbO = 11;
      this.jbP = 12;
      this.jbQ = 13;
      this.jbS = false;
      this.jbW = new d.c()
      {
        public final void bk(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348043997184L, 129253);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbU = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 10;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.a(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348043997184L, 129253);
        }
        
        public final void bl(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348178214912L, 129254);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbU = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 11;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.b(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348178214912L, 129254);
        }
        
        public final void bm(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348312432640L, 129255);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbU = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 12;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.c(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348312432640L, 129255);
        }
        
        public final void y(String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(17348446650368L, 129256);
          w.i("MicroMsg.AppBrandOnlineVideoProxy", "on finish [%s %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 13;
          com.tencent.mm.plugin.appbrand.app.f.Sk().ov(AppBrandOnlineVideoProxy.OnlineVideoProxy.this.hSm);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.d(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348446650368L, 129256);
        }
      };
      GMTrace.o(17373411147776L, 129442);
    }
    
    public OnlineVideoProxy(Parcel paramParcel)
    {
      GMTrace.i(17373545365504L, 129443);
      this.jbJ = 0;
      this.START = 1;
      this.jbK = 2;
      this.jbL = 3;
      this.STOP = 4;
      this.jbN = 10;
      this.jbO = 11;
      this.jbP = 12;
      this.jbQ = 13;
      this.jbS = false;
      this.jbW = new d.c()
      {
        public final void bk(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348043997184L, 129253);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbU = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 10;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.a(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348043997184L, 129253);
        }
        
        public final void bl(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348178214912L, 129254);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbU = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 11;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.b(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348178214912L, 129254);
        }
        
        public final void bm(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(17348312432640L, 129255);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt1;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbU = paramAnonymousInt2;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 12;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.c(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348312432640L, 129255);
        }
        
        public final void y(String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(17348446650368L, 129256);
          w.i("MicroMsg.AppBrandOnlineVideoProxy", "on finish [%s %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbT = paramAnonymousInt;
          AppBrandOnlineVideoProxy.OnlineVideoProxy.this.jbR = 13;
          com.tencent.mm.plugin.appbrand.app.f.Sk().ov(AppBrandOnlineVideoProxy.OnlineVideoProxy.this.hSm);
          AppBrandOnlineVideoProxy.OnlineVideoProxy.d(AppBrandOnlineVideoProxy.OnlineVideoProxy.this);
          GMTrace.o(17348446650368L, 129256);
        }
      };
      f(paramParcel);
      GMTrace.o(17373545365504L, 129443);
    }
    
    public final void RS()
    {
      GMTrace.i(17373813800960L, 129445);
      w.d("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess cdnMediaId[%s] state[%d]", new Object[] { this.hSm, Integer.valueOf(this.jbM) });
      switch (this.jbM)
      {
      default: 
        w.w("MicroMsg.AppBrandOnlineVideoProxy", "unknow state ");
      case 1: 
      case 4: 
      case 2: 
        for (;;)
        {
          this.jbM = 0;
          w.i("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess reset mainState[%d] ", new Object[] { Integer.valueOf(this.jbM) });
          VC();
          GMTrace.o(17373813800960L, 129445);
          return;
          localObject1 = com.tencent.mm.plugin.appbrand.app.f.Sk();
          String str1 = this.hSm;
          Object localObject2 = this.jbW;
          ((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGs.put(str1, localObject2);
          localObject1 = com.tencent.mm.plugin.appbrand.app.f.Sk();
          str1 = this.hSm;
          localObject2 = this.url;
          String str2 = this.path;
          w.i("MicroMsg.AppbrandCdnService", "add online video task [%s] url[%s] path[%s]", new Object[] { str1, localObject2, str2 });
          i locali = new i();
          locali.field_mediaId = str1;
          locali.field_fullpath = str2;
          locali.url = ((String)localObject2);
          locali.htj = ((com.tencent.mm.plugin.appbrand.d.b)localObject1).iGt;
          locali.htd = 1;
          locali.hsY = 3;
          o.Nb().a(locali, false);
          continue;
          com.tencent.mm.plugin.appbrand.app.f.Sk().ov(this.hSm);
          com.tencent.mm.plugin.appbrand.app.f.Sk();
          localObject1 = this.hSm;
          w.i("MicroMsg.AppbrandCdnService", "cancel online video task [%s]", new Object[] { localObject1 });
          o.Nb().b((String)localObject1, null);
          continue;
          com.tencent.mm.plugin.appbrand.app.f.Sk();
          localObject1 = this.hSm;
          i = this.offset;
          j = this.length;
          w.i("MicroMsg.AppbrandCdnService", "request online video task [%s]", new Object[] { localObject1 });
          o.Nb();
          com.tencent.mm.modelcdntran.f.e((String)localObject1, i, j);
        }
      }
      com.tencent.mm.plugin.appbrand.app.f.Sk();
      Object localObject1 = this.hSm;
      int i = this.offset;
      int j = this.length;
      w.i("MicroMsg.AppbrandCdnService", "check online video task [%s]", new Object[] { localObject1 });
      this.jbS = o.Nb().isVideoDataAvailable((String)localObject1, i, j);
      VC();
      GMTrace.o(17373813800960L, 129445);
    }
    
    public final void VB()
    {
      GMTrace.i(17373679583232L, 129444);
      w.d("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess cdnMediaId[%s] clientState[%d] [%d %d]", new Object[] { this.hSm, Integer.valueOf(this.jbR), Integer.valueOf(this.jbT), Integer.valueOf(this.jbU) });
      if (this.jbV == null)
      {
        GMTrace.o(17373679583232L, 129444);
        return;
      }
      switch (this.jbR)
      {
      }
      for (;;)
      {
        this.jbR = 0;
        w.i("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess reset clientState[%d] ", new Object[] { Integer.valueOf(this.jbR) });
        GMTrace.o(17373679583232L, 129444);
        return;
        this.jbV.gX(this.jbT);
        continue;
        this.jbV.onDataAvailable(this.hSm, this.jbT, this.jbU);
        continue;
        this.jbV.f(this.hSm, this.jbT, this.jbU);
        continue;
        this.jbV.y(this.hSm, this.jbT);
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(17373948018688L, 129446);
      this.hSm = paramParcel.readString();
      this.jbM = paramParcel.readInt();
      this.path = paramParcel.readString();
      this.url = paramParcel.readString();
      this.offset = paramParcel.readInt();
      this.length = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.jbS = bool;
        this.jbR = paramParcel.readInt();
        this.jbT = paramParcel.readInt();
        this.jbU = paramParcel.readInt();
        GMTrace.o(17373948018688L, 129446);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17374082236416L, 129447);
      paramParcel.writeString(this.hSm);
      paramParcel.writeInt(this.jbM);
      paramParcel.writeString(this.path);
      paramParcel.writeString(this.url);
      paramParcel.writeInt(this.offset);
      paramParcel.writeInt(this.length);
      if (this.jbS) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeInt(this.jbR);
        paramParcel.writeInt(this.jbT);
        paramParcel.writeInt(this.jbU);
        GMTrace.o(17374082236416L, 129447);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandOnlineVideoProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */