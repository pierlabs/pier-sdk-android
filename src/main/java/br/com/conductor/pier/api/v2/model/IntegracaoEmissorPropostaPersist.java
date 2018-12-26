package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a requisi\u00E7\u00E3o do recurso de incluir integra\u00E7\u00E3o emissor
 **/
@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso de incluir integra\u00E7\u00E3o emissor")
public class IntegracaoEmissorPropostaPersist  {
  
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("idProposta")
  private Long idProposta = null;

  
  /**
   * Observa\u00E7\u00E3o do registro
   **/
  @ApiModelProperty(value = "Observa\u00E7\u00E3o do registro")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Identification code of the external proposal
   **/
  @ApiModelProperty(value = "Identification code of the external proposal")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPropostaPersist {\n");
    
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
