package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{vinculo_estabelecimento_adquirente_persist_description}}}
 **/
@ApiModel(description = "{{{vinculo_estabelecimento_adquirente_persist_description}}}")
public class VinculoEstabelecimentoAdquirentePersist  {
  
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idAdquirente")
  private Long idAdquirente = null;
  @SerializedName("codigoEstabelecimentoAdquirente")
  private String codigoEstabelecimentoAdquirente = null;

  
  /**
   * {{{vinculo_estabelecimento_adquirente_persist_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{vinculo_estabelecimento_adquirente_persist_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_persist_id_adquirente_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{vinculo_estabelecimento_adquirente_persist_id_adquirente_value}}}")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_persist_codigo_estabelecimento_adquirente_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{vinculo_estabelecimento_adquirente_persist_codigo_estabelecimento_adquirente_value}}}")
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


