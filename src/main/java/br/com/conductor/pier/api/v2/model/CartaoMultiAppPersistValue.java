package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{cartao_multi_app_persist_description}}}
 **/
@ApiModel(description = "{{{cartao_multi_app_persist_description}}}")
public class CartaoMultiAppPersistValue  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;

  
  /**
   * {{{cartao_multi_app_persist_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cartao_multi_app_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_multi_app_persist_id_pessoa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cartao_multi_app_persist_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMultiAppPersistValue {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
