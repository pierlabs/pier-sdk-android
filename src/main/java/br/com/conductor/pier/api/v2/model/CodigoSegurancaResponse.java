package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto codigo seguranca
 **/
@ApiModel(description = "Objeto codigo seguranca")
public class CodigoSegurancaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("modoEnvio")
  private String modoEnvio = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do c\u00C3\u00B3digo de seguranca (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do c\u00C3\u00B3digo de seguranca (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Emissor (idEmissor).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Emissor (idEmissor).")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Apresenta o Modo de Envio do C\u00C3\u00B3digo de Seguran\u00C3\u00A7a.
   **/
  @ApiModelProperty(value = "Apresenta o Modo de Envio do C\u00C3\u00B3digo de Seguran\u00C3\u00A7a.")
  public String getModoEnvio() {
    return modoEnvio;
  }
  public void setModoEnvio(String modoEnvio) {
    this.modoEnvio = modoEnvio;
  }

  
  /**
   * Apresenta o contato do c\u00C3\u00B3digo de seguran\u00C3\u00A7a.
   **/
  @ApiModelProperty(value = "Apresenta o contato do c\u00C3\u00B3digo de seguran\u00C3\u00A7a.")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Apresenta o status do c\u00C3\u00B3digo de seguran\u00C3\u00A7a.
   **/
  @ApiModelProperty(value = "Apresenta o status do c\u00C3\u00B3digo de seguran\u00C3\u00A7a.")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Apresenta a data de validade do c\u00C3\u00B3digo de seguran\u00C3\u00A7a gerado.
   **/
  @ApiModelProperty(value = "Apresenta a data de validade do c\u00C3\u00B3digo de seguran\u00C3\u00A7a gerado.")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  modoEnvio: ").append(modoEnvio).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


