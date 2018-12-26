package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto ServicoConta para persist\u00EAncia de dados
 **/
@ApiModel(description = "Objeto ServicoConta para persist\u00EAncia de dados")
public class RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoServico")
  private Long idTipoServico = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoServico: ").append(idTipoServico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
