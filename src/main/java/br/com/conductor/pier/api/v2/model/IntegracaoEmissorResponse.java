package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resposta do recurso de inclus\u00E3o de registro para integra\u00E7\u00E3o
 **/
@ApiModel(description = "Resposta do recurso de inclus\u00E3o de registro para integra\u00E7\u00E3o")
public class IntegracaoEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idArquivo")
  private Long idArquivo = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do registro na tabela Integra\u00E7\u00E3oEmissor
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do registro na tabela Integra\u00E7\u00E3oEmissor")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do arquivo
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do arquivo")
  public Long getIdArquivo() {
    return idArquivo;
  }
  public void setIdArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
  }

  
  /**
   * Status do registro
   **/
  @ApiModelProperty(value = "Status do registro")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Data de inclus\u00E3o do registro
   **/
  @ApiModelProperty(value = "Data de inclus\u00E3o do registro")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data da ultima altera\u00E7\u00E3o do registro
   **/
  @ApiModelProperty(value = "Data da ultima altera\u00E7\u00E3o do registro")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idArquivo: ").append(idArquivo).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
