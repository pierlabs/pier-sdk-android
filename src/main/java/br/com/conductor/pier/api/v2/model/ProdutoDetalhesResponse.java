package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{produto_detalhes_response_description}}}
 **/
@ApiModel(description = "{{{produto_detalhes_response_description}}}")
public class ProdutoDetalhesResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("idFantasiaBasica")
  private Long idFantasiaBasica = null;
  @SerializedName("fantasiaBasica")
  private String fantasiaBasica = null;
  @SerializedName("usoExterior")
  private Boolean usoExterior = null;

  
  /**
   * {{{produto_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{produto_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{produto_response_nome_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{produto_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{produto_response_status_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{produto_response_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{produto_response_id_fantasia_basica_value}}}
   **/
  @ApiModelProperty(value = "{{{produto_response_id_fantasia_basica_value}}}")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * {{{produto_detalhes_response_fantasia_basica_value}}}
   **/
  @ApiModelProperty(value = "{{{produto_detalhes_response_fantasia_basica_value}}}")
  public String getFantasiaBasica() {
    return fantasiaBasica;
  }
  public void setFantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
  }

  
  /**
   * {{{produto_detalhes_response_uso_exterior_value}}}
   **/
  @ApiModelProperty(value = "{{{produto_detalhes_response_uso_exterior_value}}}")
  public Boolean getUsoExterior() {
    return usoExterior;
  }
  public void setUsoExterior(Boolean usoExterior) {
    this.usoExterior = usoExterior;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoDetalhesResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idFantasiaBasica: ").append(idFantasiaBasica).append("\n");
    sb.append("  fantasiaBasica: ").append(fantasiaBasica).append("\n");
    sb.append("  usoExterior: ").append(usoExterior).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


