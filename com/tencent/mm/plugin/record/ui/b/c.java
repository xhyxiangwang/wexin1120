package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.plugin.record.a.g;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.plugin.record.ui.RecordMsgFileUI;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.Map;

public final class c
  implements h.b
{
  public static Map<String, View> oVC;
  private View.OnClickListener lTT;
  private h.a oUM;
  
  static
  {
    GMTrace.i(7548270804992L, 56239);
    oVC = new HashMap();
    GMTrace.o(7548270804992L, 56239);
  }
  
  public c(h.a parama)
  {
    GMTrace.i(7547599716352L, 56234);
    this.lTT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7549344546816L, 56247);
        com.tencent.mm.plugin.record.ui.a.b localb = (com.tencent.mm.plugin.record.ui.a.b)paramAnonymousView.getTag();
        Object localObject;
        if (localb.aHe == 0)
        {
          if (m.d(localb.fBc, localb.fxK))
          {
            w.i("MicroMsg.SightViewWrapper", "onclick: play sight");
            localObject = new Intent(paramAnonymousView.getContext(), RecordMsgFileUI.class);
            ((Intent)localObject).putExtra("message_id", localb.fxK);
            ((Intent)localObject).putExtra("record_xml", localb.fKr);
            ((Intent)localObject).putExtra("record_data_id", localb.fBc.lUP);
            paramAnonymousView.getContext().startActivity((Intent)localObject);
            GMTrace.o(7549344546816L, 56247);
            return;
          }
          localObject = m.d(localb.fBc.lUP, localb.fxK, true);
          g localg = s.aZh().EG((String)localObject);
          if (localg == null) {}
          for (localObject = "null";; localObject = Integer.valueOf(localg.field_status))
          {
            w.i("MicroMsg.SightViewWrapper", "onclick: cdnInfo status %s", new Object[] { localObject });
            if ((localg == null) || (2 == localg.field_status) || (3 == localg.field_status)) {
              break label256;
            }
            if (4 != localg.field_status) {
              break;
            }
            h.bl(paramAnonymousView.getContext(), paramAnonymousView.getResources().getString(R.l.dXI));
            GMTrace.o(7549344546816L, 56247);
            return;
          }
          if ((localg.field_status == 0) || (1 == localg.field_status))
          {
            GMTrace.o(7549344546816L, 56247);
            return;
          }
          label256:
          m.a(localb.fBc, localb.fxK, true);
          GMTrace.o(7549344546816L, 56247);
          return;
        }
        if (localb.aHe == 1)
        {
          w.i("MicroMsg.SightViewWrapper", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(localb.oUu.field_id), Long.valueOf(localb.oUu.field_localId), Integer.valueOf(localb.oUu.field_itemStatus) });
          if (localb.oUu.isDone())
          {
            localObject = new fr();
            ((fr)localObject).fBn.type = 14;
            ((fr)localObject).fBn.fBp = localb.fBc;
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
            w.i("MicroMsg.SightViewWrapper", "favItemInfo is Done,file exist ret = %d", new Object[] { Integer.valueOf(((fr)localObject).fBo.ret) });
            if (((fr)localObject).fBo.ret == 1)
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("key_detail_info_id", localb.oUu.field_localId);
              ((Intent)localObject).putExtra("key_detail_data_id", localb.fBc.lUP);
              ((Intent)localObject).putExtra("key_detail_can_delete", false);
              d.b(paramAnonymousView.getContext(), "favorite", ".ui.detail.FavoriteFileDetailUI", (Intent)localObject);
              GMTrace.o(7549344546816L, 56247);
              return;
            }
            if (bg.mZ(localb.fBc.tOx))
            {
              w.w("MicroMsg.SightViewWrapper", "favItemInfo getCdnDataUrl empty");
              GMTrace.o(7549344546816L, 56247);
              return;
            }
            w.w("MicroMsg.SightViewWrapper", "? info is done, source file not exist, cdn data url is not null");
          }
          for (;;)
          {
            paramAnonymousView = new fr();
            paramAnonymousView.fBn.fwq = localb.oUu.field_localId;
            if (!localb.oUu.awM()) {
              break;
            }
            w.w("MicroMsg.SightViewWrapper", "upload failed, try to restart...");
            paramAnonymousView.fBn.type = 15;
            com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
            GMTrace.o(7549344546816L, 56247);
            return;
            if ((localb.oUu.awN()) || (localb.oUu.awM()))
            {
              w.i("MicroMsg.SightViewWrapper", "favItemInfo isDownLoadFaied or isUploadFailed, wait download");
            }
            else
            {
              if ((localb.oUu.isDownloading()) || (localb.oUu.awL()))
              {
                w.i("MicroMsg.SightViewWrapper", "favItemInfo isDownloading or isUploadding, wait download");
                GMTrace.o(7549344546816L, 56247);
                return;
              }
              w.w("MicroMsg.SightViewWrapper", "other status, not done, downloading, uploading, downloadfail, uploadfail");
            }
          }
          w.w("MicroMsg.SightViewWrapper", "download failed, try to restart...");
          paramAnonymousView.fBn.type = 16;
          com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
        }
        GMTrace.o(7549344546816L, 56247);
      }
    };
    this.oUM = parama;
    GMTrace.o(7547599716352L, 56234);
  }
  
  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7547868151808L, 56236);
    paramView.setTag(paramb);
    paramView.setOnClickListener(this.lTT);
    com.tencent.mm.plugin.sight.decode.a.a locala = (com.tencent.mm.plugin.sight.decode.a.a)paramView.findViewById(R.h.image);
    ImageView localImageView = (ImageView)paramView.findViewById(R.h.cyW);
    MMPinProgressBtn localMMPinProgressBtn = (MMPinProgressBtn)paramView.findViewById(R.h.progress);
    locala.lp(paramInt);
    com.tencent.mm.plugin.record.ui.a.c localc1 = (com.tencent.mm.plugin.record.ui.a.c)paramb;
    paramb = this.oUM;
    Map localMap = oVC;
    h.a.c localc = new h.a.c();
    localc.fBc = localc1.fBc;
    if (localc1.aHe == 0)
    {
      localc.oUO = localc1.fxK;
      if (m.d(localc1.fBc, localc1.fxK))
      {
        localImageView.setVisibility(8);
        localMMPinProgressBtn.setVisibility(8);
        paramView = m.c(localc1.fBc, localc1.fxK);
        if (!paramView.equals(locala.Nx())) {
          locala.D(paramb.a(localc));
        }
        locala.an(paramView, false);
        GMTrace.o(7547868151808L, 56236);
        return;
      }
      paramView = m.d(localc1.fBc.lUP, localc1.fxK, true);
      paramView = s.aZh().EG(paramView);
      if ((paramView == null) || (2 == paramView.field_status)) {
        localImageView.setImageResource(R.k.dqL);
      }
      for (;;)
      {
        localImageView.setVisibility(0);
        localMMPinProgressBtn.setVisibility(8);
        locala.clear();
        locala.D(paramb.a(localc));
        GMTrace.o(7547868151808L, 56236);
        return;
        if ((3 == paramView.field_status) || (4 == paramView.field_status))
        {
          localImageView.setImageResource(R.g.bdr);
        }
        else
        {
          if ((paramView.field_status == 0) || (1 == paramView.field_status))
          {
            localImageView.setVisibility(8);
            localMMPinProgressBtn.setVisibility(0);
            localMMPinProgressBtn.setProgress((int)(paramView.field_offset / Math.max(1, paramView.field_totalLen) * 100.0F));
            locala.clear();
            locala.D(paramb.a(localc));
            GMTrace.o(7547868151808L, 56236);
            return;
          }
          localImageView.setImageResource(R.k.dqL);
        }
      }
    }
    if (localc1.aHe == 1)
    {
      localMap.put(localc1.fBc.lUP, paramView);
      w.d("MicroMsg.SightRecordData", "dataId %s, status %s", new Object[] { Long.valueOf(localc1.oUu.field_localId), Integer.valueOf(localc1.oUu.field_itemStatus) });
      localc.oUO = localc1.oUu.field_localId;
      paramView = new fr();
      paramView.fBn.type = 14;
      paramView.fBn.fBp = localc1.fBc;
      com.tencent.mm.sdk.b.a.uLm.m(paramView);
      if ((!localc1.oUu.isDone()) && (paramView.fBo.ret != 1)) {
        break label762;
      }
      if (paramView.fBo.ret == 1)
      {
        localImageView.setVisibility(8);
        localMMPinProgressBtn.setVisibility(8);
        paramView.fBn.type = 2;
        com.tencent.mm.sdk.b.a.uLm.m(paramView);
        paramView = paramView.fBo.path;
        if (bg.mZ(paramView))
        {
          w.w("MicroMsg.SightRecordData", "videoPath is null!");
          GMTrace.o(7547868151808L, 56236);
          return;
        }
        if (!paramView.equals(locala.Nx())) {
          locala.D(paramb.a(localc));
        }
        locala.an(paramView, false);
        GMTrace.o(7547868151808L, 56236);
        return;
      }
      if (!bg.mZ(localc1.fBc.tOx)) {
        break label743;
      }
      localImageView.setImageResource(R.g.bdr);
    }
    for (;;)
    {
      localImageView.setVisibility(0);
      localMMPinProgressBtn.setVisibility(8);
      locala.clear();
      locala.D(paramb.a(localc));
      GMTrace.o(7547868151808L, 56236);
      return;
      label743:
      w.w("MicroMsg.SightRecordData", "? info is done, source file not exist, cdn data url is not null");
      localImageView.setImageResource(R.k.dqL);
      continue;
      label762:
      if ((localc1.oUu.awN()) || (localc1.oUu.awM()))
      {
        localImageView.setImageResource(R.k.dqL);
      }
      else
      {
        if (localc1.oUu.isDownloading())
        {
          localImageView.setVisibility(8);
          localMMPinProgressBtn.setVisibility(0);
          localMMPinProgressBtn.cgd();
          locala.clear();
          locala.D(paramb.a(localc));
          GMTrace.o(7547868151808L, 56236);
          return;
        }
        w.w("MicroMsg.SightRecordData", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        localImageView.setImageResource(R.k.dqL);
      }
    }
  }
  
  public final View cY(Context paramContext)
  {
    GMTrace.i(7547733934080L, 56235);
    View localView = View.inflate(paramContext, R.i.dei, null);
    ((com.tencent.mm.plugin.sight.decode.a.a)localView.findViewById(R.h.image)).tG(com.tencent.mm.bq.a.fromDPToPix(paramContext, 260));
    GMTrace.o(7547733934080L, 56235);
    return localView;
  }
  
  public final void destroy()
  {
    GMTrace.i(7548002369536L, 56237);
    this.oUM = null;
    GMTrace.o(7548002369536L, 56237);
  }
  
  public final void pause()
  {
    GMTrace.i(7548136587264L, 56238);
    GMTrace.o(7548136587264L, 56238);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */