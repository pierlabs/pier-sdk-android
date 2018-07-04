package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{codigo_seguranca_response_description}}}
 **/
@ApiModel(description = "{{{codigo_seguranca_response_description}}}")
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
   * {{{codigo_seguranca_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{codigo_seguranca_response_id_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_response_id_emissor_value}}}")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{codigo_seguranca_response_modo_envio_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_response_modo_envio_value}}}")
  public String getModoEnvio() {
    return modoEnvio;
  }
  public void setModoEnvio(String modoEnvio) {
    this.modoEnvio = modoEnvio;
  }

  
  /**
   * {{{codigo_seguranca_response_contato_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_response_contato_value}}}")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{codigo_seguranca_response_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_response_ativo_value}}}")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{codigo_seguranca_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_response_data_validade_value}}}")
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


