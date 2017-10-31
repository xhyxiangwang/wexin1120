package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ab;
import com.tencent.mm.protocal.c.jd;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class g
  extends ab
{
  protected static c.a gLR;
  public String koK;
  public String koL;
  public String koM;
  public String koN;
  public String koO;
  public boolean koP;
  public jd koQ;
  public jh koR;
  public List<a> koS;
  public List<b> koT;
  public int koU;
  public int koV;
  public boolean koW;
  public List<c> koX;
  
  static
  {
    GMTrace.i(4908744966144L, 36573);
    c.a locala = new c.a();
    locala.hRR = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_type";
    locala.uQH.put("card_type", "INTEGER");
    localStringBuilder.append(" card_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "title";
    locala.uQH.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "description";
    locala.uQH.put("description", "TEXT");
    localStringBuilder.append(" description TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "logo_url";
    locala.uQH.put("logo_url", "TEXT");
    localStringBuilder.append(" logo_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "time";
    locala.uQH.put("time", "INTEGER");
    localStringBuilder.append(" time INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "card_id";
    locala.uQH.put("card_id", "TEXT");
    localStringBuilder.append(" card_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "card_tp_id";
    locala.uQH.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "msg_id";
    locala.uQH.put("msg_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msg_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "msg_id";
    locala.columns[8] = "msg_type";
    locala.uQH.put("msg_type", "INTEGER");
    localStringBuilder.append(" msg_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "jump_type";
    locala.uQH.put("jump_type", "INTEGER");
    localStringBuilder.append(" jump_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "url";
    locala.uQH.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "buttonData";
    locala.uQH.put("buttonData", "BLOB");
    localStringBuilder.append(" buttonData BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "operData";
    locala.uQH.put("operData", "BLOB");
    localStringBuilder.append(" operData BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "report_scene";
    locala.uQH.put("report_scene", "INTEGER");
    localStringBuilder.append(" report_scene INTEGER");
    localStringBuilder.append(", ");
    locala.columns[14] = "read_state";
    locala.uQH.put("read_state", "INTEGER default '0' ");
    localStringBuilder.append(" read_state INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "accept_buttons";
    locala.uQH.put("accept_buttons", "TEXT");
    localStringBuilder.append(" accept_buttons TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "consumed_box_id";
    locala.uQH.put("consumed_box_id", "TEXT");
    localStringBuilder.append(" consumed_box_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "jump_buttons";
    locala.uQH.put("jump_buttons", "TEXT");
    localStringBuilder.append(" jump_buttons TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "logo_color";
    locala.uQH.put("logo_color", "TEXT");
    localStringBuilder.append(" logo_color TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "unavailable_qr_code_list";
    locala.uQH.put("unavailable_qr_code_list", "TEXT");
    localStringBuilder.append(" unavailable_qr_code_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "all_unavailable";
    locala.uQH.put("all_unavailable", "INTEGER default 'false' ");
    localStringBuilder.append(" all_unavailable INTEGER default 'false' ");
    locala.columns[21] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(4908744966144L, 36573);
  }
  
  public g()
  {
    GMTrace.i(4907939659776L, 36567);
    this.koK = "";
    this.koL = "";
    this.koP = false;
    this.koS = null;
    this.koT = null;
    this.koU = 0;
    this.koV = 0;
    this.koX = null;
    GMTrace.o(4907939659776L, 36567);
  }
  
  public final jd ajs()
  {
    GMTrace.i(4908208095232L, 36569);
    jd localjd1;
    if (this.koQ != null)
    {
      localjd1 = this.koQ;
      GMTrace.o(4908208095232L, 36569);
      return localjd1;
    }
    try
    {
      this.koQ = ((jd)new jd().aC(this.field_buttonData));
      localjd1 = this.koQ;
      GMTrace.o(4908208095232L, 36569);
      return localjd1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardMsgInfo", "getCardButton fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardMsgInfo", localException, "", new Object[0]);
      jd localjd2 = new jd();
      GMTrace.o(4908208095232L, 36569);
      return localjd2;
    }
  }
  
  public final jh ajt()
  {
    GMTrace.i(4908342312960L, 36570);
    jh localjh1;
    if (this.koR != null)
    {
      localjh1 = this.koR;
      GMTrace.o(4908342312960L, 36570);
      return localjh1;
    }
    try
    {
      this.koR = ((jh)new jh().aC(this.field_operData));
      localjh1 = this.koR;
      GMTrace.o(4908342312960L, 36570);
      return localjh1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardMsgInfo", "getOperationRegion fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardMsgInfo", localException, "", new Object[0]);
      jh localjh2 = new jh();
      GMTrace.o(4908342312960L, 36570);
      return localjh2;
    }
  }
  
  public final void aju()
  {
    GMTrace.i(4908476530688L, 36571);
    if (this.koS == null)
    {
      this.koS = new ArrayList();
      if (bg.mZ(this.field_accept_buttons))
      {
        GMTrace.o(4908476530688L, 36571);
        return;
      }
      Map localMap = bh.p(this.field_accept_buttons, "accept_buttons_list");
      if (localMap == null)
      {
        GMTrace.o(4908476530688L, 36571);
        return;
      }
      int i = 0;
      if (i < 100)
      {
        Object localObject2 = new StringBuilder(".accept_buttons_list.accept_buttons");
        if (i > 0) {}
        for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
        {
          localObject1 = localObject1;
          localObject2 = (String)localMap.get((String)localObject1 + ".card_id");
          String str = (String)localMap.get((String)localObject1 + ".title");
          if ((bg.mZ((String)localObject2)) && (bg.mZ(str))) {
            break label461;
          }
          int j = bg.getInt((String)localMap.get((String)localObject1 + ".end_time"), 0);
          if ((j == 0) || (j > bg.Po()))
          {
            localObject2 = new a();
            ((a)localObject2).title = ((String)localMap.get((String)localObject1 + ".title"));
            ((a)localObject2).koY = ((String)localMap.get((String)localObject1 + ".sub_title"));
            ((a)localObject2).koZ = ((String)localMap.get((String)localObject1 + ".card_ext"));
            ((a)localObject2).cardId = ((String)localMap.get((String)localObject1 + ".card_id"));
            ((a)localObject2).kpb = bg.getInt((String)localMap.get((String)localObject1 + ".action_type"), 0);
            ((a)localObject2).kpa = j;
            this.koS.add(localObject2);
          }
          i += 1;
          break;
        }
      }
    }
    label461:
    GMTrace.o(4908476530688L, 36571);
  }
  
  public final void ajv()
  {
    GMTrace.i(4908610748416L, 36572);
    if (this.koT == null)
    {
      this.koT = new ArrayList();
      if (bg.mZ(this.field_jump_buttons))
      {
        GMTrace.o(4908610748416L, 36572);
        return;
      }
      Map localMap = bh.p(this.field_jump_buttons, "jump_buttons_list");
      if (localMap == null)
      {
        GMTrace.o(4908610748416L, 36572);
        return;
      }
      int i = 0;
      if (i < 100)
      {
        Object localObject2 = new StringBuilder(".jump_buttons_list.jump_buttons");
        if (i > 0) {}
        for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
        {
          localObject1 = localObject1;
          if (bg.mZ((String)localMap.get((String)localObject1 + ".title"))) {
            break label317;
          }
          localObject2 = new b();
          ((b)localObject2).title = ((String)localMap.get((String)localObject1 + ".title"));
          ((b)localObject2).description = ((String)localMap.get((String)localObject1 + ".description"));
          ((b)localObject2).kpd = ((String)localMap.get((String)localObject1 + ".button_wording"));
          ((b)localObject2).kpe = ((String)localMap.get((String)localObject1 + ".jump_url"));
          this.koT.add(localObject2);
          i += 1;
          break;
        }
      }
    }
    label317:
    GMTrace.o(4908610748416L, 36572);
  }
  
  public final void ajw()
  {
    GMTrace.i(18909398827008L, 140886);
    if (this.koX == null)
    {
      this.koX = new ArrayList();
      if (bg.mZ(this.field_unavailable_qr_code_list))
      {
        GMTrace.o(18909398827008L, 140886);
        return;
      }
      Map localMap = bh.p(this.field_unavailable_qr_code_list, "unavailable_qr_code_list");
      if (localMap == null)
      {
        GMTrace.o(18909398827008L, 140886);
        return;
      }
      int i = 0;
      if (i < 100)
      {
        Object localObject2 = new StringBuilder(".unavailable_qr_code_list.unavailable_qr_codes");
        if (i > 0) {}
        for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
        {
          localObject1 = localObject1;
          if (bg.mZ((String)localMap.get((String)localObject1 + ".code_id"))) {
            break label214;
          }
          localObject2 = new c();
          ((c)localObject2).kpf = ((String)localMap.get((String)localObject1 + ".code_id"));
          this.koX.add(localObject2);
          i += 1;
          break;
        }
      }
    }
    label214:
    GMTrace.o(18909398827008L, 140886);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(4908073877504L, 36568);
    c.a locala = gLR;
    GMTrace.o(4908073877504L, 36568);
    return locala;
  }
  
  public final class a
  {
    public String cardId;
    public String koY;
    public String koZ;
    public int kpa;
    public int kpb;
    public String title;
    
    public a()
    {
      GMTrace.i(4923106263040L, 36680);
      GMTrace.o(4923106263040L, 36680);
    }
  }
  
  public final class b
  {
    public String description;
    public String kpd;
    public String kpe;
    public String title;
    
    public b()
    {
      GMTrace.i(4912905715712L, 36604);
      GMTrace.o(4912905715712L, 36604);
    }
  }
  
  public final class c
  {
    public String kpf;
    
    public c()
    {
      GMTrace.i(18907519778816L, 140872);
      GMTrace.o(18907519778816L, 140872);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */