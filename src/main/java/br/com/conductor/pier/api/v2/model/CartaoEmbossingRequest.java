package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{cartao_embossing_request_description}}}
 **/
@ApiModel(description = "{{{cartao_embossing_request_description}}}")
public class CartaoEmbossingRequest  {
  
  @SerializedName("id_pessoa")
  private Long idPessoa = null;
  @SerializedName("id_tipo_plastico")
  private Long idTipoPlastico = null;

  
  /**
   * {{{cartao_embossing_request_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_request_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_embossing_request_id_tipo_plastico_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_request_id_tipo_plastico_value}}}")
  public Long getIdTipoPlastico() {
    return idTipoPlastico;
  }
  public void setIdTipoPlastico(Long idTipoPlastico) {
    this.idTipoPlastico = idTipoPlastico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingRequest {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idTipoPlastico: ").append(idTipoPlastico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
