package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso aviso viagens
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso aviso viagens")
public class AvisoViagemResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("codigoPais")
  private String codigoPais = null;
  @SerializedName("dataInicio")
  private String dataInicio = null;
  @SerializedName("dataFim")
  private String dataFim = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("paisDescricao")
  private String paisDescricao = null;

  
  /**
   * C\u00F3digo identificador \u00FAnico do aviso viagem na base (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador \u00FAnico do aviso viagem na base (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o na base (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do cart\u00E3o na base (id)")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Codigo identificador do pa\u00EDs na base (id)
   **/
  @ApiModelProperty(value = "Codigo identificador do pa\u00EDs na base (id)")
  public String getCodigoPais() {
    return codigoPais;
  }
  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  
  /**
   * Data inicio do aviso viagem
   **/
  @ApiModelProperty(value = "Data inicio do aviso viagem")
  public String getDataInicio() {
    return dataInicio;
  }
  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }

  
  /**
   * Data fim do aviso viagem
   **/
  @ApiModelProperty(value = "Data fim do aviso viagem")
  public String getDataFim() {
    return dataFim;
  }
  public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
  }

  
  /**
   * Identifica se o aviso viagem esta ativo ou n\u00E3o
   **/
  @ApiModelProperty(value = "Identifica se o aviso viagem esta ativo ou n\u00E3o")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Descri\u00E7\u00E3o do pa\u00EDs
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do pa\u00EDs")
  public String getPaisDescricao() {
    return paisDescricao;
  }
  public void setPaisDescricao(String paisDescricao) {
    this.paisDescricao = paisDescricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvisoViagemResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  codigoPais: ").append(codigoPais).append("\n");
    sb.append("  dataInicio: ").append(dataInicio).append("\n");
    sb.append("  dataFim: ").append(dataFim).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  paisDescricao: ").append(paisDescricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
