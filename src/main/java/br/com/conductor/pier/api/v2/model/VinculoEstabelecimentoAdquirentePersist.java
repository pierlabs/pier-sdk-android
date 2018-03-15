package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto VinculoEstabelecimentoPersist
 **/
@ApiModel(description = "Objeto VinculoEstabelecimentoPersist")
public class VinculoEstabelecimentoAdquirentePersist  {
  
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idAdquirente")
  private Long idAdquirente = null;
  @SerializedName("codigoEstabelecimentoAdquirente")
  private String codigoEstabelecimentoAdquirente = null;

  
  /**
   * Apresenta o id do estabelecimento.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o id do estabelecimento.")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Apresenta o id do adquirente.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o id do adquirente.")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * Apresenta o c\u00F3digo de v\u00EDnculo entre o estabelecimento e o adquirente.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o c\u00F3digo de v\u00EDnculo entre o estabelecimento e o adquirente.")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoEstabelecimentoAdquirentePersist {\n");
    
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idAdquirente: ").append(idAdquirente).append("\n");
    sb.append("  codigoEstabelecimentoAdquirente: ").append(codigoEstabelecimentoAdquirente).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
