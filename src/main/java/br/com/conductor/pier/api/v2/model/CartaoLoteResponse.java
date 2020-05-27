package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Cartoes Lotes
 **/
@ApiModel(description = "Objeto Cartoes Lotes")
public class CartaoLoteResponse  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idLote")
  private Long idLote = null;
  @SerializedName("idCartaoPai")
  private Long idCartaoPai = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (IdCartao)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (IdCartao)")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do lote (IdLote)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do lote (IdLote)")
  public Long getIdLote() {
    return idLote;
  }
  public void setIdLote(Long idLote) {
    this.idLote = idLote;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o pai
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o pai")
  public Long getIdCartaoPai() {
    return idCartaoPai;
  }
  public void setIdCartaoPai(Long idCartaoPai) {
    this.idCartaoPai = idCartaoPai;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoLoteResponse {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idLote: ").append(idLote).append("\n");
    sb.append("  idCartaoPai: ").append(idCartaoPai).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
