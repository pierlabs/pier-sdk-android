package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do recurso de quita\u00E7\u00E3o anual de d\u00E9bitos
 **/
@ApiModel(description = "Objeto de resposta do recurso de quita\u00E7\u00E3o anual de d\u00E9bitos")
public class QuitacaoAnualResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("flagQuite")
  private Boolean flagQuite = null;

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Flag que representa o estado de quita\u00E7\u00E3o do portador
   **/
  @ApiModelProperty(value = "Flag que representa o estado de quita\u00E7\u00E3o do portador")
  public Boolean getFlagQuite() {
    return flagQuite;
  }
  public void setFlagQuite(Boolean flagQuite) {
    this.flagQuite = flagQuite;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuitacaoAnualResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  flagQuite: ").append(flagQuite).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
