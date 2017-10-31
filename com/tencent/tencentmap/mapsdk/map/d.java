package com.tencent.tencentmap.mapsdk.map;

import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.CameraPosition.Builder;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.rastercore.d.a;

public final class d
{
  private boolean xDq = true;
  public MapView xDr;
  
  public d(MapView paramMapView)
  {
    this.xDr = paramMapView;
  }
  
  public final void b(GeoPoint paramGeoPoint)
  {
    g localg = this.xDr.getMap();
    paramGeoPoint = com.tencent.mapsdk.rastercore.f.a.a(paramGeoPoint);
    localg.a(new a(d.a.a(CameraPosition.builder().target(paramGeoPoint).build())), 1000L);
  }
  
  public final void c(GeoPoint paramGeoPoint)
  {
    g localg = this.xDr.getMap();
    localg.a(b.a(com.tencent.mapsdk.rastercore.f.a.a(paramGeoPoint), localg.getZoomLevel()), 0L);
  }
  
  public final void setZoom(int paramInt)
  {
    this.xDr.getMap().a(b.aD(paramInt), 0L);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/map/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */