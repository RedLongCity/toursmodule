package com.smitsworks.toursmodule.model;

import java.util.List;
import java.util.Objects;

public class Filters {

    private List<TypesBean> types;
    private List<CurrenciesBean> currencies;
    private List<CountriesBean> countries;
    private List<CountryGroupsBean> country_groups;
    private List<RegionsBean> regions;
    private List<HotelRatingsBean> hotel_ratings;
    private List<TransportTypesBean> transport_types;

    public List<TypesBean> getTypes() {
        return types;
    }

    public void setTypes(List<TypesBean> types) {
        this.types = types;
    }

    public List<CurrenciesBean> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrenciesBean> currencies) {
        this.currencies = currencies;
    }

    public List<CountriesBean> getCountries() {
        return countries;
    }

    public void setCountries(List<CountriesBean> countries) {
        this.countries = countries;
    }

    public List<CountryGroupsBean> getCountry_groups() {
        return country_groups;
    }

    public void setCountry_groups(List<CountryGroupsBean> country_groups) {
        this.country_groups = country_groups;
    }

    public List<RegionsBean> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionsBean> regions) {
        this.regions = regions;
    }

    public List<HotelRatingsBean> getHotel_ratings() {
        return hotel_ratings;
    }

    public void setHotel_ratings(List<HotelRatingsBean> hotel_ratings) {
        this.hotel_ratings = hotel_ratings;
    }

    public List<TransportTypesBean> getTransport_types() {
        return transport_types;
    }

    public void setTransport_types(List<TransportTypesBean> transport_types) {
        this.transport_types = transport_types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filters filters = (Filters) o;
        return Objects.equals(types, filters.types) &&
                Objects.equals(currencies, filters.currencies) &&
                Objects.equals(countries, filters.countries) &&
                Objects.equals(country_groups, filters.country_groups) &&
                Objects.equals(regions, filters.regions) &&
                Objects.equals(hotel_ratings, filters.hotel_ratings) &&
                Objects.equals(transport_types, filters.transport_types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(types, currencies, countries, country_groups, regions, hotel_ratings, transport_types);
    }

    public static class TypesBean {
        /**
         * id : 1
         * name : Проезд включен
         */

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TypesBean typesBean = (TypesBean) o;
            return Objects.equals(id, typesBean.id) &&
                    Objects.equals(name, typesBean.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public static class CurrenciesBean {
        /**
         * id : 1
         * name : USD
         */

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CurrenciesBean that = (CurrenciesBean) o;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public static class CountriesBean {
        /**
         * id : 318
         * name : Турция
         * iso : tur
         * type_id : 1
         * group_id : 1
         * transport_type_id : 1
         */

        private String id;
        private String name;
        private String iso;
        private String type_id;
        private String group_id;
        private String transport_type_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIso() {
            return iso;
        }

        public void setIso(String iso) {
            this.iso = iso;
        }

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public String getTransport_type_id() {
            return transport_type_id;
        }

        public void setTransport_type_id(String transport_type_id) {
            this.transport_type_id = transport_type_id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountriesBean that = (CountriesBean) o;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name) &&
                    Objects.equals(iso, that.iso) &&
                    Objects.equals(type_id, that.type_id) &&
                    Objects.equals(group_id, that.group_id) &&
                    Objects.equals(transport_type_id, that.transport_type_id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, iso, type_id, group_id, transport_type_id);
        }
    }

    public static class CountryGroupsBean {
        /**
         * id : 1
         * name : Самые популярные
         */

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountryGroupsBean that = (CountryGroupsBean) o;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public static class RegionsBean {
        /**
         * id : 8688
         * name : Абано Терме
         * type_id : 1,2
         * country_id : 76
         * parent_id : 0
         */

        private String id;
        private String name;
        private String type_id;
        private String country_id;
        private String parent_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public String getCountry_id() {
            return country_id;
        }

        public void setCountry_id(String country_id) {
            this.country_id = country_id;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RegionsBean that = (RegionsBean) o;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name) &&
                    Objects.equals(type_id, that.type_id) &&
                    Objects.equals(country_id, that.country_id) &&
                    Objects.equals(parent_id, that.parent_id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, type_id, country_id, parent_id);
        }
    }

    public static class HotelRatingsBean {
        /**
         * id : 7
         * name : 2
         */

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HotelRatingsBean that = (HotelRatingsBean) o;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public static class TransportTypesBean {
        /**
         * id : 0
         * name : Все виды
         */

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TransportTypesBean that = (TransportTypesBean) o;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
